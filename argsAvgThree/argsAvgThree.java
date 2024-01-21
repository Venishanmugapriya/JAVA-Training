class argsAvgThree{
public static void main(String []args){
int total=0;
for(int i=0;i<=2;i++){
total+=Integer.parseInt(args[i]);
}
System.out.println("Average:"+total/3);
}
}
