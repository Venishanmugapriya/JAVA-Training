import java.io.Console;
public class PerfectNum{
public static void main(String[]args){
Console console=System.console();
System.out.print("Enter the integer: ");
int n=Integer.parseInt(console.readLine());
int sum=0;
for(int i=1;i<=n/2;i++){
if(n%i==0){ 
sum+=i;
}
}
if(sum==n){
System.out.println(sum+" is a perfect number");
}else{
System.out.println(sum+" is not a perfect number"); 
}
}
}