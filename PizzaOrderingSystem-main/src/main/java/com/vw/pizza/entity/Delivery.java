package com.vw.pizza.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity

public class Delivery {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long did;

	@OneToOne(mappedBy = "orderA", cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private Order oid;

	private String deliveryAddress;

	private Boolean isDelivered;

	private Long mobileNo;

	private Date deliveryTime;

	private Boolean isAccepted;

	public Delivery() {
	}

	public Delivery(Long did, Order oid, String deliveryAddress, Boolean isDelivered, Long mobileNo, Date deliveryTime,
			Boolean isAccepted) {
		super();
		this.did = did;
		this.oid = oid;
		this.deliveryAddress = deliveryAddress;
		this.isDelivered = isDelivered;
		this.mobileNo = mobileNo;
		this.deliveryTime = deliveryTime;
		this.isAccepted = isAccepted;
	}

	public Boolean getIsAccepted() {
		return isAccepted;
	}

	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}

	public Long getdId() {
		return did;
	}

	public void setdId(Long id) {
		this.did = id;
	}

	public Order getOrder() {
		return oid;
	}

	public void setOrder(Order oid) {
		this.oid = oid;
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

	@Override
	public String toString() {
		return "Delivery [did=" + did + ", oid=" + oid + ", deliveryAddress=" + deliveryAddress + ", isDelivered="
				+ isDelivered + ", mobileNo=" + mobileNo + ", deliveryTime=" + deliveryTime + ", isAccepted="
				+ isAccepted + ", getIsAccepted()=" + getIsAccepted() + ", getId()=" + getdId() + ", getOrder()="
				+ getOrder() + ", getDeliveryAddress()=" + getDeliveryAddress() + ", getIsDelivered()="
				+ getIsDelivered() + ", getMobileNo()=" + getMobileNo() + ", getDeliveryTime()=" + getDeliveryTime()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
