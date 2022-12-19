package com.example.testvue;

import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

public class TestController {
    @RequestMapping("/test")
    @CrossOrigin
    public JSONObject test(){
        log.info("receive request");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","zhangsan");
        return jsonObject;
    }
}
