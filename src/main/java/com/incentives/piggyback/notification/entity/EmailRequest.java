package com.incentives.piggyback.notification.entity;

import lombok.Data;

@Data
public class EmailRequest {

	private String emailId;
	private String vendorDisplayName;
	private String couponCode;
	private String subject = "Here's your exclusive offer code!";
	private String redirectUrl;
}