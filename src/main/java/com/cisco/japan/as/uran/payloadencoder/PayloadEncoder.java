package com.cisco.japan.as.uran.payloadencoder;

import java.util.List;


/**
 * 返却値は下記のJsonNodeのList。
 *  １つのJsonNode は下記を表現する
	"decoded_payload": 
		{
			"uplink_time": "2014-10-10T13:50:40+09:00", // ISO 8601準拠
			"encoded_payload": "0c1002789271999371a10",
			"payload_json": {
				"protocol": "0c1002",
				"Longitude": "139.75495999999998",
				"Latitude": "35.649792999999995",
				"GpsFixStatus": "not fix",
				"ReportType": "Periodic mode report",
				"BatteryCapacity": "65",
				"Date&Time": "2014-10-10T13:50:40+09:00" // ISO 8601準拠
			}
		}
 * 
 * 
 * 
 * @author ykurozum
 *
 */
public interface PayloadEncoder {

	public List<DecodedPayload> encode(List<EncodedPayload> encodedPayloadList) throws Exception;

}
