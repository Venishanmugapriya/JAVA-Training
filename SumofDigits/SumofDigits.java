class SumofDigits{
public static void main(String []args){
int number,reminder,sum=0;
number=567;
while(number>0)
{
reminder = number%10;  
sum = sum+reminder;  
number =number/10;  
}
System.out.println("Sum of Digits: "+sum);
}
}