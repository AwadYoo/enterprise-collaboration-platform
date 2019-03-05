package com.ecp.repo;

import com.ecp.entity.Upload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadRepo extends JpaRepository<Upload,Long> {
}
