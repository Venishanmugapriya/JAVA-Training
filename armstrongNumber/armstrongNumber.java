import java.io.Console;
class armstrongNumber
{
public static void main(String args[])
{
Console console = System.console();
System.out.println("Enter the number n:");
int n=Integer.parseInt(console.readLine());
int rem,cube,sum=0;
int original=n;
while(n>0)
{
rem=n % 10;
cube=rem*rem*rem;
sum=sum+cube;
n=n/10;
}
if (sum==original)
System.out.println(original+"is an armstrong number");
else
System.out.println(original+"is not an armstrong number");
}
}