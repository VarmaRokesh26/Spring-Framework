package com.webapplication.jobportal.service;

import java.util.List;

import com.webapplication.jobportal.model.JobPost;
import com.webapplication.jobportal.repo.JobRepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addjob(JobPost jobpost) {
        repo.addJob(jobpost);
    }

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }
}
