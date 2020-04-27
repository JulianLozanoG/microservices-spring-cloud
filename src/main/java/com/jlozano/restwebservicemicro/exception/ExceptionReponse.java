package com.jlozano.restwebservicemicro.exception;

import java.util.Date;

public class ExceptionReponse {
	
	//timestamp
	private Date timestamp;
	//message
	private String message;
	//detail
	private String detail;
	
	public ExceptionReponse(Date timestamp, String message, String detail) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.detail = detail;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetail() {
		return detail;
	}
	
	
	
}
