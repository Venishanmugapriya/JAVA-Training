class MiniMaxi
{
public static void main(String[] args) 
{
int max=Integer.parseInt(args[0]);
int min=Integer.parseInt(args[0]);
for(int i=1;i<args.length;i++)
{
if(Integer.parseInt(args[i])>max)
max=Integer.parseInt(args[i]); 
if(Integer.parseInt(args[i])<min) 
min=Integer.parseInt(args[i]);
}
System.out.println("Maximum:"+max);
System.out.println("Minimum:"+min);
}
}