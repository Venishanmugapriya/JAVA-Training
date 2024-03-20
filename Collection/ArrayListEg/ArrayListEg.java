import java.util.*;
public class ArrayListEg{
public static void main(String[]args){
ArrayList<Integer> arr=new ArrayList<>();
arr.add(1);
arr.add(2);
arr.add(3);
arr.add(4);
arr.add(5);
arr.add(6);
arr.add(7);
System.out.println("ArrayList before removal:");
System.out.println(arr);
arr.remove(4);
System.out.println("ArrayList after removal:");
System.out.println(arr);
}
}