package com.vw.pizza.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class DeliveryIssueException extends RuntimeException {
	public DeliveryIssueException(String msg) {
		super(msg);
	}
}
