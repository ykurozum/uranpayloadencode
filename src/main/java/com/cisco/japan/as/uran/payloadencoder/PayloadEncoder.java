package com.cisco.japan.as.uran.payloadencoder;

import java.util.List;


/**
 * �ԋp�l�͉��L��JsonNode��List�B
 *  �P��JsonNode �͉��L��\������
	"decoded_payload": 
		{
			"uplink_time": "2014-10-10T13:50:40+09:00", // ISO 8601����
			"encoded_payload": "0c1002789271999371a10",
			"payload_json": {
				"protocol": "0c1002",
				"Longitude": "139.75495999999998",
				"Latitude": "35.649792999999995",
				"GpsFixStatus": "not fix",
				"ReportType": "Periodic mode report",
				"BatteryCapacity": "65",
				"Date&Time": "2014-10-10T13:50:40+09:00" // ISO 8601����
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
