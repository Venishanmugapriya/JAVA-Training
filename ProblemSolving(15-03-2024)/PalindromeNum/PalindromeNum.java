import java.io.Console;
public class PalindromeNum{
public static void main(String[]args){
Console console=System.console();
System.out.print("Enter the integer: ");
int n=Integer.parseInt(console.readLine());
int rem,rev=0;
int original=n;
while(n>0){
rem=n%10;
rev=rev*10+rem;
n=n/10;
}    
if(rev==original){
System.out.println(original+" is an palindrome number");
}else{
System.out.println(original+" is not an palindrome number"); 
}    
}
}

