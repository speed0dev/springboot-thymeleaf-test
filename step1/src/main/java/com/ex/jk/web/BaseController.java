package com.ex.jk.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/v")
public class BaseController {

    @GetMapping("/")
    public String root(){

        return "App root";
    }

    @GetMapping("/do")
    public String doAct(){
        log.debug("doAct() begin ----------------------------");

        log.debug("doAct() end ----------------------------");
        return "";
    }
}
