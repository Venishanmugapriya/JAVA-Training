public class gradeCheck{
public static void main(String[]args){
double percentage=96.75;
if(percentage>50)
{   
if(percentage>=50&&percentage<60)    
System.out.println("Grade: D");
else if(percentage>=60&&percentage<70)
System.out.println("Grade: C");
else if(percentage>=70&&percentage<80)
System.out.println("Grade: B");
else if(percentage>=80&&percentage<90)    
System.out.println("Grade: A");
else if(percentage>=90&&percentage<=100)
System.out.println("Grade: O");
}
else
{
System.out.println("Not eligible for grade");
}
}
}