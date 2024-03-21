public class Pattern24{
public static void main(String[]args){
for(int i=7;i>=1;i--){
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