package com.springboot.altimetric.demo.message;

public class MessageBean {

	private String message;

	public MessageBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("MessageBean [message=%s]", message);
	}

}
