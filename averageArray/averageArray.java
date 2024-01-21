class averageArray{
public static void main(String args[]){
int argsLength=args.length;
int argsTotal = 0;
for (int i=0;i<argsLength;i++)
{
argsTotal+=Integer.parseInt(args[i]);
}
System.out.println("Average:"+argsTotal/argsLength);
}
}