import java.io.Console;
public class Armstrong2{
public static void main(String[]args){
Console console=System.console();
System.out.print("Enter the integer: ");
int n=Integer.parseInt(console.readLine());
int rem,cube,sum=0;
int original=n;
while(n>0){
rem=n%10;
cube=rem*rem*rem;
sum=sum+cube;
n=n/10;
}
if(sum==original){
System.out.println(original+" is an armstrong number");
}else{
System.out.println(original+" is not an armstrong number"); 
}
}
}
