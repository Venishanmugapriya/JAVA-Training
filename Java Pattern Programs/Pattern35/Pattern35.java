public class Pattern35{
public static void main(String[]args){
for(int i=65;i<=71;i++){
for(int k=71;k>=i;k--){
System.out.print(" ");
}
for(int j=65;j<=i;j++){
System.out.print((char)j+" ");
}
System.out.println();
}
} 
}