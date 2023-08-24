package com.springbootpractice.springbootpractice.controller;


import com.springbootpractice.springbootpractice.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @GetMapping("hello/{var}")
    public String getHello(@PathVariable("var") String var1){
        return var1;
    }

    @GetMapping("request")
    public String getRequest(
            @RequestParam String name,
            @RequestParam String age
    ){
        return name + " " + age;
    }


    @GetMapping("request2")
    public  String getRequest2(@RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }


    @GetMapping(value = "/request3")
    public String getRequest3(MemberDTO memberDTO){
        return memberDTO.toString();
    }
}
