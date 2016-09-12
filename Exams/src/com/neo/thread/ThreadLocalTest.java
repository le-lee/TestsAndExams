package com.neo.thread;

class Account{
	private ThreadLocal<String>name = new ThreadLocal<String>();
	public Account(String str){
		this.name.set(str);
		System.out.println("---" + this.name.get());
	}
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.name.set(name);
	}
}
class MyTest extends Thread{
	private Account account;
	public MyTest(Account account, String name){
		super(name);
		this.account = account;
	}
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			if(i == 6){
				account.setName(currentThread().getName());
			}
			System.out.println(account.getName() + "账户的i值:" + i);
		}
	}
}
public class ThreadLocalTest extends Thread{
	public static void main(String[] args) {
		Account at = new Account("萝卜丁");
		new MyTest(at,"Thread A").start();
		new MyTest(at,"Thread B").start();
	}
}
