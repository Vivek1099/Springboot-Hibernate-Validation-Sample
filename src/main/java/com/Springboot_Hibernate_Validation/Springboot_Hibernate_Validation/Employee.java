package com.Springboot_Hibernate_Validation.Springboot_Hibernate_Validation;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity (name="employee_data")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@NotBlank(message="first name cannot be blank")
	@NotEmpty
	@Column(name="first_name",nullable=false,length=50,insertable=true,updatable=true) // same thing use this length is maximum 5
	// note the parameters of @Column annotations length must be max 50
	
	String fname;
	String lname;
	
	@Min(value=18)
	@Max(30) // above tells age must be 18 and max 30
	//@Range(min=18,max=30) used for integers 
	//@Size(min=1,max=2)  NOTE THIS IS FOR STRING DATA LENGTH ONLY FOR NUMERICS USE ABOVE ANNO
	@Digits(fraction = 0, integer = 2)// purely into INTEGERS with no decimal point
	int age;
	
	
	@NotNull(message="city cannot be null")
	String city;
	
	
	@Email(message="Email must be proper")
	@Column(name="email",unique=true)
	@NotEmpty(message="email must be valid")
	String email;
//	@NotEmpty(message="there must be email")
//	@Pattern(regexp = "^[a-zA-Z0-9]{6,12}$",message="password must not contain special chars")
//	String password;

//	@CreationTimestamp
//	@Column(name="created_at",nullable=false,updatable=false)
//	Date createdat;
//	@Column(name="updated_at")
//	@UpdateTimestamp
//	Date updatedat;

//	@JsonFormat(pattern="yyyy-MM-dd")// this is for only user input NOTE MM  is capital here 
//	LocalDate DOB;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

//	public Date getCreatedat() {
//		return createdat;
//	}
//
//	public void setCreatedat(Date createdat) {
//		this.createdat = createdat;
//	}
//
//	public Date getUpdatedat() {
//		return updatedat;
//	}
//
//	public void setUpdatedat(Date updatedat) {
//		this.updatedat = updatedat;
//	}

//	public LocalDate getDOB() {
//		return DOB;
//	}
//
//	public void setDOB(LocalDate dOB) {
//		DOB = dOB;
//	}
	
	
}
