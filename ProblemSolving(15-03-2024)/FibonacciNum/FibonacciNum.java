public class FibonacciNum{
public static void main(String[]args){
int a=0;
int b=1;
int n=8;
System.out.println(a);
System.out.println(b);
for(int i=2;i<n;i++){
int c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}








