package com.sbootweb1.springbootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping
    public String home() {
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num11, int num2, ModelAndView mv) {

        int num = num11 + num2;
        mv.addObject("num", num);
        mv.setViewName("result");

        System.out.println(num);
        return mv;
    }
}
