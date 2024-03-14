class EvenNum extends Thread{
   int limit; 
 public EvenNum(int limit){
 this.limit=limit;
}
public void run(){
    for(int i=2;i<=limit;i+=2){
        System.out.println(i);
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
}
class OddNum extends Thread{
   int limit; 
public OddNum(int limit){
    this.limit=limit;
}   
public void run(){
    for(int i=1;i<=limit;i+=2){
        System.out.println(i);
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
}
public class MultiThreading{
    public static void main(String[]args){
         int limit=10;
        EvenNum even=new EvenNum(limit);
        OddNum odd=new OddNum(limit);
        even.start();
        odd.start();
        
    }
}








