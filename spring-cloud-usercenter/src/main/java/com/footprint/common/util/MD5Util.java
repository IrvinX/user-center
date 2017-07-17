package com.footprint.common.util;

import java.security.MessageDigest;

/**
 * MD5工具(JDK1.8)
 *
 * @author wulin
 */
public class MD5Util {
	public final static String MD5(String s) {
		String header = "184bd4b5b3884d979acacc1879065704";
		String tail = "3666e528da5e4f6b997b29678c02d1a2";
		char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		s = header + s + tail;
		try {
			byte[] btInput = s.getBytes("utf-8");
			// 获得MD5摘要算法的 MessageDigest 对象
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘要
			mdInst.update(btInput);
			// 获得密文
			byte[] md = mdInst.digest();
			// 把密文转换成十六进制的字符串形式
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 测试代码
//	public static void main(String[] args) {
//		System.out.println(MD5Util.getMD5("66061592-4", "456"));
//		System.out.println(MD5Util.MD5("111111"));
//		System.out.println(MD5Util.MD5("加密"));
//	}

	public static String encodePassword(String password, String algorithm) {
		byte[] unencodedPassword = password.getBytes();

		MessageDigest md = null;

		try {
			md = MessageDigest.getInstance(algorithm);
		} catch (Exception e) {
			return password;
		}

		md.reset();

		md.update(unencodedPassword);

		byte[] encodedPassword = md.digest();

		StringBuffer buf = new StringBuffer();

		for (int i = 0; i < encodedPassword.length; i++) {
			if ((encodedPassword[i] & 0xFF) < 16) {
				buf.append("0");
			}

			buf.append(Long.toString(encodedPassword[i] & 0xFF, 16));
		}

		return buf.toString();
	}

	/**
	 * 获取用户密码的MD5
	 *
	 * @param userId
	 * @param pwd
	 * @return
	 */
	public static final String getMD5(String userId, String pwd) {
		return encodePassword(userId + pwd, "MD5");
	}

}