import java.io.Console;
public class mathsOperations{
int c[] = new int[4];
int add(int a,int b){
c[0] = a+b;
return c[0];   
}
int sub(int a,int b)
{
c[1] = a-b;
return c[1];
}
int mul(int a,int b)
{
c[2]= a*b;
return c[2];
}
int div(int a,int b)
{
c[3] = a/b;
return c[3];
}
public static void main(String[]args){
Console con = System.console();   
System.out.print("Enter number 1:");
int number1 = Integer.parseInt(con.readLine());
System.out.print("Enter number 2:");
int number2 = Integer.parseInt(con.readLine());
mathsOperations m = new mathsOperations();
System.out.println("ADDITION:"+m.add(number1,number2));
System.out.println("SUBTRACTION:"+m.sub(number1,number2));
System.out.println("MULTIPLICATION:"+m.mul(number1,number2));
System.out.println("DIVISION:"+m.div(number1,number2));
}
}
