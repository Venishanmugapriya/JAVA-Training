public class Pattern39{
public static void main(String[] args) {
int n=7;
int letter=65;
for(int i=7;i>=1;i--){ 
for(int k=0;k<=n-i;k++){
System.out.print("  ");   
}
for(int j=0;j<i;j++){
System.out.print((char)(j+letter)+" ");   
}
System.out.println();
}
for(int i=2;i<=n;i++){ 
for(int k=0;k<=n-i;k++){
System.out.print("  ");   
}
for(int j=0;j<i;j++){
System.out.print((char)(j+letter)+" ");   
}
System.out.println();
}
}
}