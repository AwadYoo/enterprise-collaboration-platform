package com.ecp.mode.dto;

import com.ecp.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import static com.ecp.common.util.DateUtils.yyyy_mmddhhmiss;

/**
 * @author 尤贺雨
 * @create 2019-02-26 14:55
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO implements Serializable {
    private Long id;
    private String userId;
    private String userName;
    private String userEmail;
    private String userSex;
    //private String userStatus;
    //private String userGrade;
    private String lastLoginTime;
    private String userDesc;
    //private String birthday;
    //private String mobile;
    //private String face;

    public UserDTO() {
    }


    public UserDTO(User user) {
        this.id = user.getId();
        this.userId = user.getLoginId();
        this.userName = user.getUserName();
        this.userEmail = user.getEmail();
        this.userSex = User.getStringSex(user.getGender());
        //this.userStatus = getStringState(user.isEnabled());
        LocalDateTime loginTime = user.getLastLoginTime();
        this.lastLoginTime = loginTime == null ? "" : yyyy_mmddhhmiss.format(loginTime);
        this.userDesc = user.getMemo();
        //LocalDate b = user.getBirthday();
        //this.birthday = b == null ? "" : yyyymmdd.format(b);
        //this.mobile = user.getMobile();
        //this.face = user.getFace();
    }

    //public static String getStringState(boolean state) {
    //    return state ? "正常用户" : "限制用户";
    //}
    //
    //public static boolean getBooleanState(String state) {
    //    return "正常用户".equals(state);
    //}
}
