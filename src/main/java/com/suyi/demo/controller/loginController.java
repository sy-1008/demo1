package com.suyi.demo.controller;

import com.suyi.demo.model.User;
import com.suyi.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class loginController<LoginRequest, StatusResponse> {
    /**
     * 用户登录
     */
    @Resource
    UserService userService;

    @Resource
    HttpServletResponse response;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "redirect:/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String Login(HttpServletRequest request, User u, Model model) {


        // 验证用户身份是否正确
        User loginUser = userService.loginUserByUserid(u.getUserId(), u.getPassword());
        if (loginUser == null) {
            request.setAttribute("msg", "用户名或密码错误");
            model.addAttribute("errorUser", u);
            return "common/login.html";
        }
        // 设置 Session

//        HttpSession session = request.getSession();
//
//     session.setAttribute("user", loginUser);
//model.addAttribute("user",loginUser);
        //根据权限进入不同页面
        if (loginUser.getRole() == 3) {//学生
            return "redirect:/studentpage";
        }
        if (loginUser.getRole() == 2) {//教师

            return "redirect:/teacherpage";
        }
        if (loginUser.getRole() == 1) {//管理员

            return "redirect:/coursepage";
        }
        return "common/login.html";
    }

}


