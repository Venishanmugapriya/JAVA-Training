public class Pattern4{
public static void main(String[]args){
int n=5;
for(int r=1;r<=n;r++){
for (int c=1;c<=n;c++){
if(r==(n/2)+1 || c==1 || c==n){
System.out.print("* ");
}else{
System.out.print("  ");
}
}
System.out.println();
}
}
}