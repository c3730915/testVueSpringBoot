package com.example.testvue;

import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@CrossOrigin
public class TestController {
    @RequestMapping("/test")
    public JSONObject test(@RequestParam("ID") Integer id){
        log.info("receive request, id is:{}",id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","zhangsan");
        return jsonObject;
    }

    @PostMapping("/submit")
    public String submitForm(@RequestBody FormData data){
        log.info( "receive submit form request, param is:{}",data );
        return "success!";
    }
}
