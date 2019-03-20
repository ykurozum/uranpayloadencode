package com.cisco.japan.as.uran.payloadencoder;

import java.util.Date;

import com.fasterxml.jackson.databind.JsonNode;

public class DecodedPayload {
	/**
	 *  EncodedPayload�œn���ꂽ����
	 */
	Date  time;
	/**
	 *  �f�[�^���̂��\������̎��ԁi�ʏ�̓f�[�^�̍̎掞���j
	 */
	Date payloadTime;
	/**
	 * �f�R�[�h�O��payload(�ʏ�͑Ή�����EncodedPayload�̒l���Z�b�g�j
	 */
	String payloadString;
	/**
	 * payload�f�R�[�h���JSON�i�f�o�C�X��ނɂ���ėl�X�j
	 */
	JsonNode palyloadJson;
	/**
	 * �f�o�C�X�̎��ʎq�i�f�R�[�h�ɂ����EncodedPayload����ύX�̉\��������j
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
