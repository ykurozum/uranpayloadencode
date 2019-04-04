package com.cisco.japan.as.uran.payloadencoder;

import java.util.Date;

import com.fasterxml.jackson.databind.JsonNode;

public class DecodedPayload {
	/**
	 * EncodedPayloadで渡された時間
	 */
	Date time;
	/**
	 * payload内のデータ自体が表す特定の時間（通常はデータの採取時刻）。無い場合はnull
	 */
	Date payloadTime;
	/**
	 * デコード前のpayload(通常は対応するEncodedPayloadの値をセット）
	 */
	String payloadString;
	/**
	 * payloadデコード後のJSON（デバイス種類によって様々だが、例えば下記のようなJsonNodeとなる） 
	 * { "protocol": "0c1002",
	 *   "Longitude": "139.75495999999998",
	 *   "Latitude": "35.649792999999995",
	 *   "GpsFixStatus": "not fix",
	 *   "ReportType": "Periodic mode report",
	 *   "BatteryCapacity": "65",
	 *   "Date&Time": "2014-10-10T13:50:40+09:00" // ISO8601準拠 
	 * }
	 * 
	 */
	JsonNode palyloadJson;
	/**
	 * デバイスの識別子（通常はEncodedPayloadで渡された値だが、デコードによってEncodedPayloadから変更の可能性もある）
	 */
	String deviceIdentifiyer;

	public DecodedPayload(Date time, Date payloadTime, String payloadString, JsonNode palyloadJson,
			String deviceIdentifiyer) {
		this.time = time;
		this.payloadTime = payloadTime;
		this.payloadString = payloadString;
		this.palyloadJson = palyloadJson;
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
