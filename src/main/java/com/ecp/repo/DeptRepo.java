package com.ecp.repo;

import com.ecp.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 尤贺雨
 * @create 2019-02-27 11:18
 */
@Repository
public interface DeptRepo extends JpaRepository<Dept, Long> {
}
