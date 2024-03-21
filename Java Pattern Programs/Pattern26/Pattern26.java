public class Pattern26{
public static void main(String[] args) {
int n=7;
for(int i=n;i>=1;i--){ 
for(int k=n;k>i;k--){
System.out.print("  ");   
}
for(int j=1;j<=i;j++){
System.out.print("*"+" ");   
}
System.out.println();
}
}
}