package multiThreading;

public class MultiThreadingBehaviour extends Thread{

	public void run(){
		System.out.print(1+" ");
		System.out.print(2+" ");
		System.out.print(3+" ");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MultiThreadingBehaviour m1=new MultiThreadingBehaviour();
		MultiThreadingBehaviour m2=new MultiThreadingBehaviour();
		m1.start();
		m1.join();
		m2.start();
	}

}
