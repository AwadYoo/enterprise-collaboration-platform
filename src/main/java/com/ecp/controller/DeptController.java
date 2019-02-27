package com.ecp.controller;

import com.alibaba.fastjson.JSONObject;
import com.ecp.mode.OKResponse;
import com.ecp.mode.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 尤贺雨
 * @create 2019-02-27 11:44
 */
@RestController
public class DeptController {

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

}
