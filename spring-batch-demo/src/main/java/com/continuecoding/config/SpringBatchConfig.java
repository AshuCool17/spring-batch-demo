/**
 * 
 */
package com.continuecoding.config;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.continuecoding.repository.CustomerRepository;

import lombok.AllArgsConstructor;

/**
 * @author Ashutosh
 *
 */
@Configuration
@EnableBatchProcessing
@AllArgsConstructor
public class SpringBatchConfig {

	private JobBuilderFactory jobBuilderFactory;
	
	private StepBuilderFactory stepBuilderFactory;
	
	private CustomerRepository customerRepository;	
}
