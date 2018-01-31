package com.taobao.controller;
import com.taobao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

/**
 * @author FaceFeel
 * @Created 2018-01-31 16:41
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String show(HttpServletRequest request){
        request.setAttribute("show",userService.getUserList());
        return "success";
    }
}
