package com.webapp.jobapp.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.webapp.jobapp.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>{

	
}
