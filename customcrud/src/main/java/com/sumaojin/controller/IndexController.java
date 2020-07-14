package com.sumaojin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
    /**
     * 跳转到主页
     * @return
     */
    @GetMapping("/index")
    public String toIndex(){
        return "ems/login";
    }


    /**
     * 跳转到员工添加界面
     * @return
     */
    @GetMapping("/toSave")
    public String toSave(){
        return "ems/addEmp";
    }
}
