package com.cisco.japan.as.uran.payloadencoder;

import java.util.Date;

import com.fasterxml.jackson.databind.JsonNode;

public class DecodedPayload {
	/**
	 *  EncodedPayloadで渡された時間
	 */
	Date  time;
	/**
	 *  データ自体が表す特定の時間（通常はデータの採取時刻）
	 */
	Date payloadTime;
	/**
	 * デコード前のpayload(通常は対応するEncodedPayloadの値をセット）
	 */
	String payloadString;
	/**
	 * payloadデコード後のJSON（デバイス種類によって様々）
	 */
	JsonNode palyloadJson;
	/**
	 * デバイスの識別子（デコードによってEncodedPayloadから変更の可能性もある）
	 */
	String deviceIdentifiyer;
	
	public DecodedPayload(Date time,Date  payloadTime, String payloadString,JsonNode palyloadJson,String deviceIdentifiyer) {
		this.time = time;
		this.payloadTime = payloadTime;
		this.payloadString = payloadString;
		this.palyloadJson = palyloadJson;
		this.deviceIdentifiyer =deviceIdentifiyer;	
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
	public JsonNode getPalyloadJson() {
		return palyloadJson;
	}
	public void setPalyloadJson(JsonNode palyload_json) {
		this.palyloadJson = palyload_json;
	}
	public String getDeviceIdentifiyer() {
		return deviceIdentifiyer;
	}
	public void setDeviceIdentifiyer(String deviceIdentifiyer) {
		this.deviceIdentifiyer = deviceIdentifiyer;
	}
	public Date getPayloadTime() {
		return payloadTime;
	}
	public void setPayloadTime(Date payloadTime) {
		this.payloadTime = payloadTime;
	}
}
