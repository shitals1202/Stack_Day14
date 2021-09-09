package Day14.Stack;

class main{
	public static void main(String[] args){
		Stack stack =new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		System.out.println("The Top element is "+stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		if (stack.isEmpty()){
			System.out.println("The stack is empty");
		}
		else{
			System.out.println("stack is empty");
		}
	}
}