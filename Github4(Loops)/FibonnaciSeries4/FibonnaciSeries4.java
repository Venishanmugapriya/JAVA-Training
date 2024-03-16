public class FibonnaciSeries4{
public static void main(String[]args){
int a=0;
int b=1;
System.out.println(a);
System.out.println(b);
int limit=7;
for(int i=2;i<limit;i++){
int c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
