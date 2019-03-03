package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @RequestMapping("/tologin")
    public String initLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession httpSession){
        if("yhchdev".equals(user.getName())&&"666".equals(user.getPassword())){
            httpSession.setAttribute("user",user);//将用户信息保存到session中
            return "main";
        }else {
            model.addAttribute("msg","用户或密码错误请重新登陆!!!");
            return "login";
        }
    }

    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.invalidate();//销毁session对象
        return "login";
    }
}
