package com.vw.pizza.entity;

import java.util.Date;

import com.vw.entity.Order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="delivery_details")
public class Delivery {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="order_details")
	@OneToOne
	@JoinColumn(name="order_id")
	private Order order;
	@OneToOne
	@JoinColumn(name="customer_address")
	@Column(name="delivery_address")
	private String deliveryAddress;
	@Column(name="isDelivered")
	private Boolean isDelivered;
	@Column(name="mobile_number")
	private Long mobileNo;
	@Column(name="delivery_time")
	private Date deliveryTime;

	public Delivery() {
	}

	public Delivery(Long id, Order order, String deliveryAddress, Boolean isDelivered, Long mobileNo,
			Date deliveryTime) {
		super();
		this.id = id;
		this.order = order;
		this.deliveryAddress = deliveryAddress;
		this.isDelivered = isDelivered;
		this.mobileNo = mobileNo;
		this.deliveryTime = deliveryTime;
	}

	@Override
	public String toString() {
		return "Delivery [id=" + id + ", deliveryAddress=" + deliveryAddress + ", isDelivered=" + isDelivered
				+ ", mobileNo=" + mobileNo + ", deliveryTime=" + deliveryTime + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Boolean getIsDelivered() {
		return isDelivered;
	}

	public void setIsDelivered(Boolean isDelivered) {
		this.isDelivered = isDelivered;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	

}
