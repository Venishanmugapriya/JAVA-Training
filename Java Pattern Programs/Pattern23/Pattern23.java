public class Pattern23{
public static void main(String[]args){
for(int i=1;i<=7;i++){
for(int k=7;k>=i;k--){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*"+" ");
}
System.out.println();
}
} 
}