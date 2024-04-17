package com.vw.pizza.entity;

import java.util.List;

import com.vw.entity.Order;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cid;
	private String fname;
	private String lname;
	private String address;
	private String email;
	private Long mobile;
	@OneToMany(mappedBy = "Customer",cascade = CascadeType.ALL)
	private List<Order> orders;

	public Customer() {
		super();
	}

	public Customer(Long cid, String fname, String lname, String address, String email, Long mobile,
			List<Order> orders) {
		this.cid = cid;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", fname=" + fname + ", lname=" + lname + ", address=" + address + ", email="
				+ email + ", mobile=" + mobile + ", orders=" + orders + ", getOrders()=" + getOrders() + ", getCid()="
				+ getCid() + ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getAddress()="
				+ getAddress() + ", getEmail()=" + getEmail() + ", getMobile()=" + getMobile() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
}
