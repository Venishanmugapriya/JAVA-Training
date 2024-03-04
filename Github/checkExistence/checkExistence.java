public class checkExistence{
public static void main(String[]args){
int[] numbers={1,2,3,4,5,6,7,8};
boolean exists=false;
for(int i=0;i<numbers.length;i++){
if(numbers[i]==6){
System.out.println("Found");
exists=true;
break;
}
}
if(exists!=true){
System.out.println("Not Found");
}
}
}