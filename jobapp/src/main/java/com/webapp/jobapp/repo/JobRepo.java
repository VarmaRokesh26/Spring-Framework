package com.webapp.jobapp.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.webapp.jobapp.model.JobPost;
import java.util.List;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>{

	List<JobPost> findByPostProfileContainingOrOrPostDescContaining(String postProfile, String postDesc);

}
