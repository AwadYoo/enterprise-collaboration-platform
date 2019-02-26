package com.ecp.service.impl;

import com.ecp.common.Constants;
import com.ecp.entity.User;
import com.ecp.mode.OKResponse;
import com.ecp.mode.Response;
import com.ecp.mode.dto.UserDTO;
import com.ecp.repo.UserRepo;
import com.ecp.service.CurrentUser;
import com.ecp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author 尤贺雨
 * @create 2019-02-26 13:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private CurrentUser currentUser;

    @Override
    public void saveUser(String loginId, String name, String email, String sex, String status, String note) {
        User user = new User();
        user.setLoginId(loginId);
        user.setUserName(name);
        user.setEmail(email);
        user.setGender(User.getShortSex(sex));
        user.setMemo(note);
        user.setCreateUser(currentUser.user().getUserName());
        user.setPassword(passwordEncoder.encode(Constants.PARAMETER_USER_DEFAULT_PASSWORD));
        user.setCreateTime(LocalDateTime.now());
        userRepo.save(user);
    }

    @Override
    public Response<UserDTO> getAll(int page, int limit, String key) {

        Pageable pageable = PageRequest.of(page - 1, limit);
        Page<UserDTO> pageUser;
        if (key == null) {
            pageUser = userRepo.findAll(pageable).map(user -> new UserDTO(user));
        } else {
            key = "%" + key + "%";
            pageUser = userRepo.findInKey(key, pageable).map(user -> new UserDTO(user));
        }
        return new OKResponse<>(pageUser.getContent(), pageUser.getTotalElements());
    }


}
