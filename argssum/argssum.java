class argssum{
public static void main(String []args){
int sum=0;
for(int i=0;i<2;i++){
sum+=Integer.parseInt(args[i]);
}
System.out.print(sum);
}
}
