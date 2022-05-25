package com.ex.jk.web.controller;

import com.ex.jk.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
//@RequestMapping("/idx")
public class IndexController {

    @GetMapping("/")
    public String index(){
        //
        return "index";
    }

    // Security에서 처리됨
    // security 작동안함.
    @GetMapping("/loginForm")
    public String login(){

        return "loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm(){

        return "joinForm";
    }


    @GetMapping("/logout")
    @ResponseBody
    public String logout(){

        return "logout";
    }


    @GetMapping("/user")
    @ResponseBody
    public String user(){

        return "user";
    }

    //
    @GetMapping("/admin")
    @ResponseBody
    public String admin(){

        return "admin";
    }

    @GetMapping("/manager")
    @ResponseBody
    public String manager(){

        return "manager";
    }

    @GetMapping("/join")
    @ResponseBody
    public String join(User user){
        log.debug(user.getUsername() + " " + user.getPassword());

        return "join";
    }

    @GetMapping("/joinProc")
    @ResponseBody
    public String joinProc(){

        return "회원가입 완료";
    }



}
