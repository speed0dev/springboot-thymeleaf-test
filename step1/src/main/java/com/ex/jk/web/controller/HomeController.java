package com.ex.jk.web.controller;

import com.ex.jk.dto.MBook;
import com.ex.jk.rest.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.management.MBeanAttributeInfo;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Properties;

@Slf4j
@Controller
@RequestMapping("/th")
public class HomeController {

    @Autowired
    BookService bookService;

    @RequestMapping(value="/str", method= RequestMethod.GET)
    @ResponseBody
    public String goHome(HttpServletRequest req){
        log.debug("goHome()");

        return "Hello Spring bootAA";
    }

    // book
    @GetMapping("/books")
    public String getBooks(Model model){
        log.debug("[getBooks] begin ----------------------");

        MBook param = new MBook("p1", "p2", "p3", 10);

        model.addAttribute("book", param);
        List<MBook> list = bookService.getBookList();
        model.addAttribute("bookList", list);

        return "book";
    }

    @GetMapping("/")
    String index(Model model){
        log.debug("#################");
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }

    @GetMapping("properties")
    @ResponseBody
    Properties properties(){
        log.debug("#################");
        return System.getProperties();
    }

}
