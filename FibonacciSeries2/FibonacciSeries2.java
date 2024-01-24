import java.util.Scanner;
class FibonacciSeries2
{
public static void main (String[]args)
{
Scanner myObj = new Scanner (System.in);
System.out.print ("Enter the limit:");
int n = myObj.nextInt ();
int a = 0, b = 1, c;
System.out.println (a);
System.out.println (b);
for (int i = 2; i < n; i++)
{
c = a + b;
System.out.println (c);
a = b;
b = c;
}
System.out.println("Nth number in Fibonacci series:"+b);
}
}