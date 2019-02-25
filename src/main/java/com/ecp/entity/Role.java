package com.ecp.entity;

import com.ecp.entity.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Table(name = "tb_role")
@Entity
public class Role extends BaseEntity implements Serializable {

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_code")
    private String roleCode;

    @Column(name = "parent_id")
    private Long parentId;


    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "role_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Set<UserRoleMap> userRoleMaps;

    /*@JsonIgnore
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id", referencedColumnName = "id", insertable = false, updatable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<RolePrivilegeMap> rolePrivilegeMaps;*/

    //@JsonIgnore
    //@OneToMany(fetch = FetchType.EAGER)
    //@JoinColumn(name = "menu_id", referencedColumnName = "id", insertable = false, updatable = false)
    //@LazyCollection(LazyCollectionOption.FALSE)
    //private Set<RoleMenuMap> roleMenuMaps;
}
