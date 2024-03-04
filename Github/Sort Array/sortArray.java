public class sortArray{
public static void main(String[]args){
int[] numbers={10,6,9,1,8,7,3,4,2,5};
for(int i=0;i<numbers.length;i++)
{
for(int j=0;j<numbers.length-i-1;j++)
{
if(numbers[j]>numbers[j+1])
{
 int temp = numbers[j];
 numbers[j] = numbers[j + 1];
 numbers[j + 1] = temp;
}
}
}
for(int k=0;k<numbers.length;k++)
{
System.out.print(numbers[k]+" ");
}
}
}