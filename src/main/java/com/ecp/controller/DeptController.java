package com.ecp.controller;

import com.alibaba.fastjson.JSONObject;
import com.ecp.entity.Dept;
import com.ecp.mode.OKResponse;
import com.ecp.mode.Response;
import com.ecp.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 尤贺雨
 * @create 2019-02-27 11:44
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/getDept")
    public Response getDept() {
        JSONObject object = new JSONObject();
        object.put("id", 1);
        object.put("name", "研发部");
        List list = new ArrayList();
        list.add(object);
        object = new JSONObject();
        object.put("id", 2);
        object.put("name", "工程部");
        list.add(object);
        return new OKResponse(list);
    }

    @GetMapping("/getList")
    public Response getList(int page, int limit, String key) {
        Page<Dept> deptPage = deptService.getList(page, limit, key);
        return new OKResponse(deptPage.getContent(), deptPage.getTotalElements());
    }

    @PostMapping("/depts")
    public Response addUser(String code, String name, String leader, String memo) {
        try {
            deptService.saveDept(code, name, leader, memo);
            return new Response(Response.CODE_OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(Response.CODE_COMMON_ERROR, e.getMessage());
        }
    }

}
