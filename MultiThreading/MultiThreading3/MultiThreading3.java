import java.util.Scanner;
class Num1 extends Thread{
int limit1; 
public Num1(int limit1){
this.limit1=limit1;
}
public void run(){
for(int i=0;i<=limit1;i++){
System.out.println(i);
try{
Thread.sleep(3000);
}catch(InterruptedException e){
System.out.println("Interrupted");
}
}
}
}
class Num2 extends Thread{
int limit2; 
public Num2(int limit2){
this.limit2=limit2;
}   
public void run(){
for(int i=6;i<=limit2;i++){
System.out.println(i);
try{
Thread.sleep(3000);
}catch(InterruptedException e){
System.out.println("Interrupted");
}
}
}
}
public class MultiThreading3{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.print("Enter an limit for Num1: ");
int limit1=scanner.nextInt();
System.out.print("Enter an limit for Num2: ");
int limit2=scanner.nextInt();
Num1 num1=new Num1(limit1);
Num2 num2=new Num2(limit2);
num1.start();
num2.start();
}
}

