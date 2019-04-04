package com.cisco.japan.as.uran.payloadencoder;

import java.util.List;


/**
 * 
 * @author ykurozum
 *
 */
public interface PayloadEncoder {

	public List<DecodedPayload> encode(List<EncodedPayload> encodedPayloadList) throws Exception;

}
