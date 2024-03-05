import java.util.*;
public class converting1{
public static void main(String[]args){
List<Integer> arrList=new ArrayList<>();
arrList.add(1);
arrList.add(2);
arrList.add(3);
arrList.add(4);
arrList.add(5);
arrList.add(6);
arrList.add(7);
Set<Integer> set1=new HashSet<>(arrList);
System.out.println("List to set");
System.out.println("HashSet: "+set1);
List<Integer> arrList1=new ArrayList<>(set1);
System.out.println("Set to List");
System.out.println("ArrayList: "+arrList1);
}
}