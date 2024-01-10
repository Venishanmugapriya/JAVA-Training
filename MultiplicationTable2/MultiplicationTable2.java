public class MultiplicationTable2 {

    public static void main(String[] args) {

        int n = 5;
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n+"*"+i+"="+i*n);
        }
System.out.println();
int j=1;
do{
System.out.println(n+"*"+j+"="+j*n);
j++;
}while(j<=10);
System.out.println();
int k=1;
while(k<=10){
System.out.println(n+"*"+k+"="+k*n);
k++;
}
}
}