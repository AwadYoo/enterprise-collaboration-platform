package com.ecp.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;

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
    private String name;

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
