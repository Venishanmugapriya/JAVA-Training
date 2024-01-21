class arrayEven{
public static void main(String args[]){
int argsLength=args.length;
for (int i=0;i<argsLength;i++)
{
if(Integer.parseInt(args[i])%2==0)
System.out.println("even");
else
System.out.println("odd");
}
}
}
