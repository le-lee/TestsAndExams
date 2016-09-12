package com.neo.thread;

import java.util.concurrent.TimeUnit;

public class ThreadLocalTest1 {
	private static final ThreadLocal<Long>TIME_THREADLOCAL = new ThreadLocal<Long>(){
		protected Long initialValue(){
			return System.currentTimeMillis();
		}
	};
	public static final void begin(){
		TIME_THREADLOCAL.set(System.currentTimeMillis());
	}
	public static final long end(){
		return System.currentTimeMillis() - TIME_THREADLOCAL.get();
	}
	public static void main(String[] args) throws Exception {
		ThreadLocalTest1.begin();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Cost: " + ThreadLocalTest1.end() + " mills");
	} 
}
