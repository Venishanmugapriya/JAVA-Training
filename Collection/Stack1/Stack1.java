import java.util.Stack;
public class Stack1{
public static void main(String[]args){
Stack<String> stack = new Stack<String>();
stack.push("A");
stack.push("B");
stack.push("C");
stack.push("D");
stack.push("E");
stack.push("F");
System.out.println(stack);
stack.pop();
System.out.println(stack);
stack.pop();
System.out.println(stack);
System.out.println(stack.peek());
System.out.println(stack.search("C"));
}
}