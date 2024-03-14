class RunnableThread implements Runnable{
public void run(){
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
try{
Thread.sleep(1000);
}catch(InterruptedException e){
}
}
}
public class RunnableInterface{
public static void main(String[]args){
for(int i=0;i<3;i++){
Thread t=new Thread(new RunnableThread());
t.setName("Main Thread-"+i);
t.setPriority(5);
t.start();
}
 }
}