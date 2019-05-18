package com.yhch;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {
    @RequestMapping(path = "/hello")
    public String hello(){
        System.out.println("hello word");

        //返回成功的页面
        return "success";
    }
}
