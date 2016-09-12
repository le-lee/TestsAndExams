package com.neo.thread;

public class ThreadTest {
	private int data;
	private int result = 0;
	public /*synchronized*/ void m(){
		result += 2;
		data += 2;
		System.out.println(result+ " "+data);
	}
	public static void main(String []args){
		ThreadTest t = new ThreadTest();
		Test test1 = new Test(t);
		Test test2 = new Test(t);
		Test test3 = new Test(t);
		test1.start();
		test2.start();
		test3.start();
	}
}
class Test extends Thread{
	private ThreadTest t;
	public Test(ThreadTest t){
		this.t = t;
	}
	@Override
	public void run(){
//		synchronized(t){
			t.m();
//		}
	}
}
