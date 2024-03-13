class PrintNumbers extends Thread{
int threadNumber;
public PrintNumbers(int i){
threadNumber=i;
}
public void run(){
for(int i=0;i<3;i++){
System.out.println(threadNumber+" "+i);
try{
Thread.sleep(1000);
}catch(InterruptedException e){
System.out.println("Interrupted");
}
}
}
}
public class MultiThreading2{
public static void main(String[]args){
for(int i=0;i<3;i++){
PrintNumbers obj1=new PrintNumbers(i);
obj1.threadNumber=i;
obj1.start();
}
}
}