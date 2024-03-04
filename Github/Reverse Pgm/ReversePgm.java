public class ReversePgm{
public static void main(String[]args){
int n=321;
while(n!=0){
int num=n%10;
System.out.print(num);
n=n/10;
}
}
}