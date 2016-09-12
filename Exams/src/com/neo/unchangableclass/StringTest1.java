package com.neo.unchangableclass;

public class StringTest1 {
	public static void main(String[]args){
		String str = new String("hello");
		char [] ch = {'a','b','c'};
		fun(str,ch);
		System.out.print(str+" ");
		for(char item : ch){
			System.out.print(item);
		}
	}
	public static void fun(String str,char[]ch){
		str = "world";
		ch[0] = 'd';
	}
}
