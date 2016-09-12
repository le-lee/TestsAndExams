package polymorphism;
/**
 * 多态的测试
 * @author lile
 *
 */
public class Polymorphism {
	public static void main(String[] args) {
		A a0 = new A();
		A a1 = new B();
		B b0 = new B();
		a0.doSth(100, 50);
		a1.doSth(100, 50);
		b0.doSth(100, 50);
	}
}
class A{
	public void doSth(int a, int b){
		System.out.println("a - b: "+ (a - b));
	}
}
class B extends A{
	public void doSth(int a, int b){
		System.out.println("a + b: "+ (a + b));
	}
}
