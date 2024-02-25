/**
 * 
 */
package com.continuecoding.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.continuecoding.entity.Customer;

/**
 * @author Ashutosh
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
