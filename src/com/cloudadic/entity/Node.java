package com.cloudadic.entity;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Class which stores the details of a person like first name, last name, mobile no, address
 * @author Maaniccka Poonkundran
 * 
 */
public class Node {
	
	public Integer id;
	public boolean seen;
	public List<Edge> adjListEdges;
	
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String address;
	
	/**
	 * Default Constructor
	 */
	public Node() {
	}
	
	/**
	 * Parameterized Constructor
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param mobileNo
	 * @param address
	 */
	public Node(Integer id, String firstName, String lastName, String mobileNo, String address) {
		this.id = id;
		this.seen = false;
		this.adjListEdges = new LinkedList<Edge>();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	
	
	/**
	 * Getters and Setters
	 */
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * toString() overriden method
	 */
	public String toString() {
		return "(" + id + ", " + firstName + " " + lastName + ", " + mobileNo + ")";
	}
}


