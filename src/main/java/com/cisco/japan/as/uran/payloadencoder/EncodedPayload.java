package com.cisco.japan.as.uran.payloadencoder;

import java.util.Date;

public class EncodedPayload {
	Date  time;
	String payloadString;
	
	public EncodedPayload(Date time, String payloadString) {
		this.time = time;
		this.payloadString = payloadString;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getPayloadString() {
		return payloadString;
	}
	public void setPayloadString(String payloadString) {
		this.payloadString = payloadString;
	}

}
