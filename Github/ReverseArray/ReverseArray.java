public class ReverseArray{
public static void main(String[]args){
int[] numbers = {1, 2, 3, 4, 5};
int[] Reverse = new int[5];
for(int i = 0; i < numbers.length; i++) 
{
Reverse[i] = numbers[i];
}
System.out.print("Reverse array: ");
for(int i = 4; i >=0; i--)
{
int num = Reverse[i];
System.out.print(num+" ");
}
}
}