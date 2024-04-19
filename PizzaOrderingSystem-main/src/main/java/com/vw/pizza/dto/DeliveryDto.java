package com.vw.pizza.dto;

import java.util.Date;

public class DeliveryDto {
	private Long did;
	private Boolean isDelivered;
	private Long mobileNo;
	private Boolean isAccepted;
	private String deliveryAddress;
	private Date deliveryTime;
	public Date getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public Long getDid() {
		return did;
	}
	public void setDid(Long did) {
		this.did = did;
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
	public Boolean getIsAccepted() {
		return isAccepted;
	}
	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
	
}
