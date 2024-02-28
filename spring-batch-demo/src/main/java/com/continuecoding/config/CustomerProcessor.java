/**
 * 
 */
package com.continuecoding.config;

import org.springframework.batch.item.ItemProcessor;

import com.continuecoding.entity.Customer;

/**
 * @author Ashutosh
 *
 */
public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer item) throws Exception {
		return null;
	}

}
