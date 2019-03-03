package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Person;

@Controller
public class TestController {
    @RequestMapping("/testJson")
    @ResponseBody
    public Person testJson(@RequestBody Person person){
        System.out.println(person.getPname()+","+person.getPassword()+","+person.getAge());
        return person;
    }
}
