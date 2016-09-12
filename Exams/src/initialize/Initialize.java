package initialize;
/**
 * 类的初始化顺序
 * @author lile
 *
 */
public class Initialize {
	public static Initialize init = new Initialize();
	{
		System.out.println("block A");
	}
	static{
		System.out.println("block B");
	}
	public static void main(String []args){
		System.out.println("before create a new Object in main method");
		Initialize init1 = new Initialize();
	}
}
