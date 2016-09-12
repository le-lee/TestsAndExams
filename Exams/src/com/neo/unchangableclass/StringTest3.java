package com.neo.unchangableclass;

public class StringTest3 {
	public static void main(String[] args) {
		String baseStr = "baseStr";
		final String baseFinalStr = "baseStr";
		
		String str1 = "baseStr01";
		String str2 = "baseStr" + "01";
		String str3 = baseStr + "01";
		String str4 = baseFinalStr + "01";
		String str5 = new String("baseStr01").intern();
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str1 == str5);
	}
}
