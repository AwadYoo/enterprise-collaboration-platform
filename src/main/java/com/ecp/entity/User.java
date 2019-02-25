package com.ecp.entity;

import com.ecp.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
//CREATE TABLE `tb_user` (
//        `id` bigint(20) NOT NULL AUTO_INCREMENT,
//        `role_id` bigint(20) DEFAULT NULL COMMENT '角色id',
//        `name` varchar(255) DEFAULT NULL,
//        `gender` tinyint(255) DEFAULT NULL COMMENT '0-男，1-女',
//        `job` varchar(255) DEFAULT NULL COMMENT '工作名称',
//        `dept_id` varchar(255) DEFAULT NULL COMMENT '部门',
//        `phone` int(15) DEFAULT NULL COMMENT '手机',
//        `email` varchar(255) DEFAULT NULL,
//        `login_id` varchar(255) DEFAULT NULL COMMENT '登陆名称',
//        `password` varchar(255) DEFAULT NULL COMMENT '密码',
//        `create_time` datetime DEFAULT NULL COMMENT '创建时间',
//        `create_user` varchar(255) DEFAULT NULL COMMENT '创建者',
//        `update_time` datetime DEFAULT NULL COMMENT '修改时间',
//        `update_user` datetime DEFAULT NULL COMMENT '修改者',
//        `memo` varchar(255) DEFAULT NULL COMMENT '备注',
//        PRIMARY KEY (`id`)
//        ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

@Data
@Entity
@Table(name = "tb_user")
public class User extends BaseEntity implements Serializable {

    @Column(name = "role_id")
    private Long roleId;

//    @JoinColumn(referencedColumnName = "role_id", insertable = false, updatable = false)
//    @NotFound(action = NotFoundAction.IGNORE)
//    private Role role;

    @Column(name = "name")
    private String userName;

    @Column(name = "gender")
    private Short gender;

    @Column(name = "job")
    private String job;

    @Column(name = "dept_id")
    private Long deptId;

//    @JoinColumn(referencedColumnName = "dept_id", insertable = false, updatable = false)
//    @NotFound(action = NotFoundAction.IGNORE)
//    private Dept dept;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "email")
    private String email;

    @Column(name = "login_id")
    private String loginId;

    @Column(name = "password")
    private String password;
}
