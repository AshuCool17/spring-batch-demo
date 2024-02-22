/**
 * 
 */
package com.continuecoding.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * @author Ashutosh
 *
 */
@Entity
@Table
public class Customer {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;

}
