package com.sbootweb1.springbootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping
    public String home() {
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int num11, int num2, Model model) {

        int num = num11 + num2;
        model.addAttribute("num", num);

        System.out.println(num);
        return "result";
    }
}
