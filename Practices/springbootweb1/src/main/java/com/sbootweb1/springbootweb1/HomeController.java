package com.sbootweb1.springbootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping
    public String home() {
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int num11, int num2, HttpSession session) {

        int num = num11 + num2;
        session.setAttribute("num", num);

        System.out.println(num);
        return "result.jsp";
    }
}
