//Write a Java program to check if a given string str is palindrome or not using if-else statements.//
public class palindrome{
public static boolean isPalindrome(String str)
{
int left=0;
int right=str.length()-1;
while(left<right)
{
if(str.charAt(left)!=str.charAt(right))
{
return false;
}
left++;
right--;
}
return true;
}
public static void main(String[]args){
String str="level";
if(isPalindrome(str))
{
System.out.println(str+" is palindrome");
}
else
{
System.out.println(str+" is not palindrome");
}
}
}