package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class InputController {
    @RequestMapping("/input")
    public String input(HttpServletRequest request, Model model){
        String name[] = {"赵","钱","孙","李"};
        request.setAttribute("name",name);

        String address[] = {"kunming","chengdu","shengzhen"};
        model.addAttribute("address",address);
        return "index";
    }
}
