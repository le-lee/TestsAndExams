package finallytest;

public class Test {
	public static void main(String[] args) {
		System.out.println(getValue());
	}
	public static int getValue(){
		int i = 1;
		try{
			i = 4;
			return test(i);
		}
		catch(Exception e){
			
		}
		finally {
			i++;
		}
			return i;
	}
	public static int test(int i){
		return i++;
	}
}
