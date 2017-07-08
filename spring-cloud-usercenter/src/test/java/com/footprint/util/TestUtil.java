package com.footprint.util;

import java.util.UUID;

/**
 * Created by gaofang on 2017/6/27.
 */
public class TestUtil {

	/**
	 * 生成ID
	 *
	 * @return
	 */
	public static String generateId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 生成字符串
	 *
	 * @param size
	 * @return
	 */
	public static String generateLetters(int size) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		String rtn = "";
		for (int i = 0; i < size; i++) {
			rtn += chars.charAt((int) (Math.random() * 52));
		}
		return rtn;
	}

	/**
	 * 生成数字串
	 *
	 * @param size
	 * @return
	 */
	public static String generateNums(int size) {
		String chars = "0123456789";

		String rtn = "";
		for (int i = 0; i < size; i++) {
			rtn += chars.charAt((int) (Math.random() * 10));
		}
		return rtn;
	}
}
