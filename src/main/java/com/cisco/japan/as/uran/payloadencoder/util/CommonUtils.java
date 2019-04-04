package com.cisco.japan.as.uran.payloadencoder.util;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class CommonUtils {

	/**
	 * 10進数へ変換
	 * 
	 * @param val 変換対象
	 * @return 10進数の値
	 */
	public static long toDecimalNumber(String val) {

		return Long.parseLong(val, 16);

	}
	
	/**
	 * 10進数へ変換
	 * 
	 * @param val 変換対象
	 * @return 10進数の値
	 */
	public static int toDecimalNumberInt(String val) {

		return Integer.parseInt(val, 16);

	}

	/**
	 * 2進数へ変換
	 * 
	 * @param val 変換対象
	 * @return 2進数の値
	 */
	public static String toBinaryString(long val) {
		return Long.toBinaryString(val);
	}

	/**
	 * リトルエンディアン変換
	 * 
	 * @param val 変換対象
	 * @return 変換後の値
	 */
	public static int toLittleEndian(BigInteger val) {

		ByteBuffer buf = ByteBuffer.allocate(4);
		buf.putInt(val.intValue());
		buf.flip();
		buf.order(ByteOrder.LITTLE_ENDIAN);
		int littleVal = buf.getInt();
		return littleVal;

	}
	
	/**
	 * リトルエンディアン変換(short.ver)
	 * ４桁変換時に使用
	 * @param val 変換対象
	 * @return 変換後の値
	 */
	public static short toLittleEndianShort(BigInteger val) {

		ByteBuffer buf = ByteBuffer.allocate(2);
		buf.putShort(val.shortValue());
		buf.flip();
		buf.order(ByteOrder.LITTLE_ENDIAN);
		short littleVal = buf.getShort();
		return littleVal;

	}

	/**
	 * 時刻をISO8601準拠に変換
	 * 
	 * @param val 変換対象
	 * @return 変換後の値
	 */
	public static String toIsoDate(Date date) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
		String isoDate = sdf.format(date);

		return isoDate;

	}

	/**
	 * 最大長チェック
	 * 
	 * @param hexStr    チェック対象文字列
	 * @param maxLength 最大長の値
	 * @return result チェック結果
	 */
	public static boolean checkPayloadLength(String hexStr, int maxLength) {

		boolean result = true;

		if (maxLength != hexStr.length()) {
			result = false;
		}

		return result;

	}

	/**
	 * JSONオブジェクトにデータを詰め込む
	 * 
	 * @param payloadObject JSONオブジェクト
	 * @param fieldName     フィールド名
	 * @param param         詰め込む値
	 */
	public static void packingJson(ObjectNode payloadObject, String fieldName, String param) {

		payloadObject.put(fieldName, param);

	}
}
