package com.app.parser;

public class BinaryToDecimal {
	public int convertBinaryToDecimal(String binary) {
		int conversion = 1;
		int result = 0;
		for (int i = 1; i <= binary.length(); i++) {
			if (binary.charAt(binary.length() - i) == '1')
				result += conversion;
			conversion *= 2;
		}
		return result;
	}

	public int convertToDecimalAlt(String binary) {
		int result = 0;
		for (int i = 1; i <= binary.length(); i++)
			if (binary.charAt(binary.length() - i) == '1')
				result += Math.pow(2, i - 1);

		return result;
	}
	public static void main(String[] args) {
		BinaryToDecimal btd = new BinaryToDecimal();
		System.out.println(btd.convertBinaryToDecimal("101001"));
		System.out.println(btd.convertToDecimalAlt("101001"));
	}
}
