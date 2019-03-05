package com.ecp.controller;

import com.ecp.common.FileUtil;
import com.ecp.entity.Upload;
import com.ecp.repo.UploadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class UploadController {

    @Autowired
    private UploadRepo uploadRepo;

    @RequestMapping("/upload")
    public void upLoad(MultipartFile file, HttpServletRequest request) {
        try {
            Upload upload = new Upload();

            String s = FileUtil.encodeBase64File(file);
            upload.setContent(s);
            upload.setName(file.getOriginalFilename());
            upload.setSuffix(file.getContentType());
            upload.setSize(file.getSize());
            uploadRepo.save(upload);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
