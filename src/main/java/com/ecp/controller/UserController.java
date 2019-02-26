package com.ecp.controller;

import com.ecp.entity.User;
import com.ecp.mode.Response;
import com.ecp.mode.dto.UserDTO;
import com.ecp.service.CurrentUser;
import com.ecp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 *
 * @author 尤贺雨
 * @create 2019-02-26 13:39
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private CurrentUser currentUser;

    @GetMapping("/users")
    public Response<UserDTO> getUser(int page, int limit, String key) {
        return userService.getAll(page, limit, key);
    }

    @PostMapping("/users")
    public Response addUser(String loginId, String name, String email, String sex, String status, String note) {
        try {
            userService.saveUser(loginId, name, email, sex, status, note);
            return new Response(Response.CODE_OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(Response.CODE_COMMON_ERROR, e.getMessage());
        }
    }

    @GetMapping("/users/current")
    public UserDTO currentUser() {
        return new UserDTO(currentUser.user());
    }
}
