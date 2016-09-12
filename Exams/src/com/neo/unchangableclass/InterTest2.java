package com.neo.unchangableclass;

public class InterTest2 {
	public static void main(String[] args) {
		String str1 = "str01";
		String str2 = new String("str") + new String("01");
		str2.intern();
		System.out.println(str1 == str2);
	}
}
