import java.util.*;
public class Queue1{
public static void main(String[]args){
Deque<String> queue = new ArrayDeque<String>();
queue.offer("A");
queue.offer("B");
queue.offer("C");
queue.offer("D");
queue.offer("E");
queue.offer("F");
System.out.println(queue);
queue.poll();
System.out.println(queue);
queue.poll();
System.out.println(queue);
System.out.println(queue.peek());
}
}