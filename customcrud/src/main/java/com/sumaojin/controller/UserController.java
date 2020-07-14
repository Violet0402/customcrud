package com.sumaojin.controller;

import com.sumaojin.entity.User;
import com.sumaojin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

/**
 * controller层
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 跳转主页
     * @return
     */
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 登录
     * @param mobile
     * @param password
     * @param session
     * @return
     */
    @PostMapping("/login")
    public String login(String mobile, String password, HttpSession session){
        User login = userService.login(mobile, password);
        if(login != null){
            session.setAttribute("user", login);
            return "redirect:/user/findAll";
        }
        return "redirect:/index/index";
    }

    /**
     * 查询所有员工
     * @return
     */
    @GetMapping("/findAll")
    public String findAll(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "ems/emplist";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @GetMapping("/delete")
    public String delete(String id){
        userService.deleteUser(id);
        return "redirect:/user/findAll";
    }

    @GetMapping("/findById")
    public String findById(String id, Model model){
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "ems/updateEmp";
    }

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    @PostMapping("/update")
    public String update(User user){
        userService.update(user);
        return "redirect:/user/findAll";
    }

    @PostMapping("/save")
    public String save(User user){
        userService.save(user);
        return "redirect:/user/findAll";
    }
}
