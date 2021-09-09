package Day14.Stack;

public class Stack{
	private Node top;
	public  void Stack1(){
		this.top =null;
	}
public void push (int x){
	Node node = new Node();
	if (node == null){
		System.out.print("Heap Overflow");
		return;
	}
	System.out.println("inserting "+x);
	node.data =x;
	node.next =top;
	top=node;
}
public boolean isEmpty(){
	return top == null;
}
public int peek(){
	if(!isEmpty()){
		return top.data;
	}
	else{
		System.out.println("stack is empty");
		return -1;
	}
	}
	public void pop(){
		if(top == null){
			System.out.println("Stack underflow");
			return;
		}
		System.out.println("Removing"+peek());
		top = (top).next;
	
}
}