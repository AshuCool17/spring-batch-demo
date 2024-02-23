/**
 * 
 */
package com.continuecoding.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Ashutosh
 *
 */
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	@Id
	private int id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String email;
	
	@Column
	private String gender;
	
	@Column
	private String contactNumber;
	

}
