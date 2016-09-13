package datastructure;

public class MyStack <E>{
	Node head;
	class Node{
		E data;
		Node next;
	}
	MyStack(){
		head = new Node();
	}
	public void push(E data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	public void pop(){
		if(head.next != null)
			head = head.next;
	}
	public E top(){
		return head.data;
	}
	public static void main(String[] args) {
		MyStack <Integer>stack = new MyStack<Integer>();
		Integer []data ={1,2,3}; 
		stack.push(data[0]);
		System.out.println(stack.top());
		stack.push(data[1]);
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
	}
}
