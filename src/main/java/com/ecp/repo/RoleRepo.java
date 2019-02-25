package com.ecp.repo;

import com.ecp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long>, QuerydslPredicateExecutor<Role> {

    @Query(nativeQuery = true, value = "SELECT count( r.id ) FROM tb_sys_role r LEFT JOIN tb_sys_user_role_map m ON m.role_id = r.id " +
            " WHERE m.user_id = ? AND role_name = 'admin'")
    int isAdmin(Long userId);
}
