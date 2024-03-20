public class Pattern14{
public static void main(String[]args){
for(int i=7;i>=1;i--){
for(int k=7;k>=i;k--){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print(j+" ");
}
System.out.println();
}
for(int l=2;l<=7;l++){
for(int m=7;m>=l;m--){
System.out.print(" ");
}
for(int n=1;n<=l;n++){
System.out.print(n+" ");
}

System.out.println();
}
} 
}