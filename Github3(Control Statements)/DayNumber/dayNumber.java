//Implement a Java program to determine the day of the week based on a given number dayNumber (1 for Monday, 2 for Tuesday, etc.) using switch statements.//
public class dayNumber{
public static void main(String[]args)
{
int number=2;
switch(number)
{
case 1:
System.out.println("Day of the week: Monday");
break;
case 2:
System.out.println("Day of the week: Tuesday");
break;
case 3:
System.out.println("Day of the week: Wednesday");
break;
case 4:
System.out.println("Day of the week: Thursday");
break;
case 5:
System.out.println("Day of the week: Friday");
break;
case 6:
System.out.println("Day of the week: Saturday");
break;
case 7:
System.out.println("Day of the week: Sunday");
break;
default:
System.out.println("Invalid day number");
break;
}
}
}