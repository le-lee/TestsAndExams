package datastructure;

public class MyList {
	public Node head;
	class Node{
		int data;
		Node next;
	}
	MyList(int...values)  {
		head = new Node();
		if(values != null){
			head.data = values[0];
			
			//尾插法,要记录当前指向的结点
			Node curNode = head;
			for(int i = 1; i<values.length; i++){
				Node newNode = new Node();
				newNode.data = values[i];	//初始化新结点的值域
				//更改指针，将新的结点置于当前结点的后面
				newNode.next = curNode.next;
				curNode.next = newNode;
				curNode = newNode;
			}
			//头插法
//			for(int i = 1; i<values.length; i++){
//				Node newNode = new Node();
//				newNode.data = values[i];	//初始化新结点的值域
//				//将当前结点放到新的结点后面
//				newNode.next = head;
//				head = newNode;
//			}
		}
	}
	public void printList(){
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
	}
	public void reversePrint(Node head){
		//注意啊，这里是if了，递归的本质就是栈
		if(head != null){
			reversePrint(head.next);
			System.out.println(head.data);
		}
	}
	public static void main(String []args){
		int []values = {2,4,3,6,7};
		MyList list = new MyList(values);
		//list.printList();
		list.reversePrint(list.head);
	}
}
