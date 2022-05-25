package com.ex.jk.rest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/rest")
public class DefaultRestController {

    @GetMapping("/check")
    public String check(){
        log.debug(" @@@ ### check() <=================");

        return "check";
    }

}
