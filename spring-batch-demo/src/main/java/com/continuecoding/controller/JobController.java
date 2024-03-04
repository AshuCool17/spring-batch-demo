/**
 * 
 */
package com.continuecoding.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ashutosh
 *
 */
@RestController("/jobs")
public class JobController {

	@Autowired
	private JobLauncher jobLauncher;
	
	@Autowired
	private Job job;
	
	@PostMapping
	public void importCsvToDBJob() {
		
	}
}
