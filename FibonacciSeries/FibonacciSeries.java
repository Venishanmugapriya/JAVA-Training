class FibonacciSeries
{
public static void main (String[]args)
{
int n = 3;
int a=1,b=2,c;
System.out.println (a);
System.out.println (b);
do
{
c = a + b;
System.out.println (c);
a = b;
b = c;
n++;
}
while (n <=8);
}
}