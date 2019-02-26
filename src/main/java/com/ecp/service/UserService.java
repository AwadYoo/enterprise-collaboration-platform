package com.ecp.service;

import com.ecp.entity.User;
import com.ecp.mode.Response;
import com.ecp.mode.dto.UserDTO;

/**
 * @author 尤贺雨
 * @create 2019-02-26 13:40
 */
public interface UserService {
    void saveUser(String loginId, String name, String email, String sex, String status, String note);

    Response<UserDTO> getAll(int page, int limit, String key);
}
