import java.util.*;
public class ArrayList1{
public static void main(String[]args){
ArrayList<Integer> arr=new ArrayList<>();
arr.add(7);
arr.add(6);
arr.add(20);
arr.add(4);
arr.add(11);
arr.add(25);
arr.add(30);
int maxElement=Collections.max(arr);
int minElement=Collections.min(arr);
System.out.println("Maximum number in the ArrayList: "+maxElement);
System.out.println("Minimum number in the ArrayList: "+minElement);
}
}