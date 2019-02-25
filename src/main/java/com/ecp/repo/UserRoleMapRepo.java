package com.ecp.repo;

import com.ecp.entity.User;
import com.ecp.entity.UserRoleMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleMapRepo extends JpaRepository<UserRoleMap, Long> {

    List<UserRoleMap> findAllByRoleId(Long roleId);

    List<UserRoleMap> findAllByUser(User user);

    List<UserRoleMap> findAllByUserId(Long userId);

    List<Long> deleteAllByUserId(Long userId);


}
