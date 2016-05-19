package multiThreading;

class MultiThreadPriority extends Thread{

public MultiThreadPriority(String s){
super(s);
}
 public void run(){
   System.out.println("running thread name is:"+Thread.currentThread().getName());
   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

  }
 public static void main(String args[]){
  MultiThreadPriority m1=new MultiThreadPriority("Ram");
  MultiThreadPriority m2=new MultiThreadPriority("Shyam");
  m1.setPriority(Thread.MIN_PRIORITY);
  m2.setPriority(Thread.MAX_PRIORITY);
  m1.start();
  m2.start();
 
 }
}   
