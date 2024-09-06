package com.webapp.jobapp.service;

import java.util.List;

import com.webapp.jobapp.model.JobPost;
import com.webapp.jobapp.repo.JobRepo;
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
