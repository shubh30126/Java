package multiThreading;

public class DeadlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String resource1="Shubhanshu";
		final String resource2="Dixit";
		
		Thread t1=new Thread(){
			public void run(){
				synchronized (resource1) {
				System.out.println("Get a lock on resource1 by "+Thread.currentThread().getName());
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Waitng "+Thread.currentThread().getName());
				synchronized (resource2) {
				System.out.println("Get a lock on resource2 by "+Thread.currentThread().getName());	
				}
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				synchronized (resource2) {
				System.out.println("Get a lock on resource2 by "+Thread.currentThread().getName());
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Waitng "+Thread.currentThread().getName());
				synchronized (resource1) {
				System.out.println("Get a lock on resource1 by "+Thread.currentThread().getName());	
				}
				}
			}
		};

		t1.start();
		t2.start();
		
	}

}
