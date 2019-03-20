package com.cisco.japan.as.uran.payloadencoder;

import java.util.Date;

public class EncodedPayload {
	/**
	 * payloadデータがアップロードされた時間
	 */
	Date time;
	/**
	 * デコード対象のpayloadのデータ文字列
	 */
	String payloadString;
	/**
	 * payloadStringを運搬したデバイスの識別子
	 */
	String deviceIdentifiyer;

	public EncodedPayload(Date time, String payloadString, String deviceIdentifiyer) {
		this.time = time;
		this.payloadString = payloadString;
		this.deviceIdentifiyer = deviceIdentifiyer;
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

	public String getDeviceIdentifiyer() {
		return deviceIdentifiyer;
	}

	public void setDeviceIdentifiyer(String deviceIdentifiyer) {
		this.deviceIdentifiyer = deviceIdentifiyer;
	}
}
