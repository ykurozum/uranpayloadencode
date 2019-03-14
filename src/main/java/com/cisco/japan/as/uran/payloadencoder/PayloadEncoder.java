package com.cisco.japan.as.uran.payloadencoder;

import com.fasterxml.jackson.databind.JsonNode;

public interface PayloadEncoder {

	public JsonNode encode(String[] payloadStrings) throws Exception;

}
