package com.webapplication.jobportal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.webapplication.jobportal.model.JobPost;

@Controller
public class JobController {

    @GetMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        return "success";
    }

    @GetMapping("viewalljobs") 
    public String viewAllJobs() {
        return "viewalljobs";
    }
}
