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
	public Object process(Object item) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
