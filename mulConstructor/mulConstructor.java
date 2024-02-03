public class mulConstructor{
private int num1;
private int num2;
private String str1;
private String str2;
public mulConstructor(){
num1=0;
num2=0;
}
public mulConstructor(int n1,int n2){
num1=n1;
num2=n2;
}
public mulConstructor(String s1,String s2){
str1=s1;
str2=s2;
System.out.println("The word is:"+s1+s2);
}
public void display(){
System.out.println("Number1:"+num1);
System.out.println("Number2:"+num2);
System.out.println("string1:"+str1);
System.out.println("string2:"+str2);
}
public static void main(String[]args){
mulConstructor obj1=new mulConstructor();
System.out.println("obj1:");
obj1.display();
mulConstructor obj2=new mulConstructor(7,8);
System.out.println("obj2:");
obj2.display();
mulConstructor obj3=new mulConstructor("hello","world");
System.out.println("obj3:");
obj3.display();
}
}   