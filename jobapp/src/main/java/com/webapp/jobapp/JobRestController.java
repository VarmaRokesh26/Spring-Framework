package com.webapp.jobapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.jobapp.model.JobPost;
import com.webapp.jobapp.service.JobService;

@Controller
@RestController
public class JobRestController {

    @Autowired
    public JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(Model m) {
        return service.getAllJobs();
    }
}
