package com.neo.unchangableclass;

public class StringTest2 {
	
	public static void main(String[] args) {
		String str1 = "String";
		String str2 = new String("String");
		String str3 = str2.intern();
		
		System.out.println( str1 == str2 );
		System.out.println( str1 == str3 );
	}
}
