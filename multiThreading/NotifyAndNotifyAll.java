package multiThreading;

public class NotifyAndNotifyAll {

	volatile boolean go=false;
	
	synchronized void shouldGo(){
		while(go!=true){
			System.out.println(Thread.currentThread()+" is going to wait on this object");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()+" is woken up");
		}
		go=false;		
	}
	
	synchronized void go(){
	while(go==false){
		System.out.println("This thread" +Thread.currentThread()+" goin to invoke all threads");
		go=true;
	//	notify();
		notifyAll();
	}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		final NotifyAndNotifyAll n=new NotifyAndNotifyAll();
		
		Runnable waitTask=new Runnable() {
			public void run() {
				n.shouldGo();
				System.out.println("Execution completed by waiting thread"+Thread.currentThread());
			}
		};
		
		Runnable notifyTask=new Runnable() {
			
			public void run() {
			n.go();
			System.out.println("Notification done by "+Thread.currentThread());
			}
		};
		
		Thread t1=new Thread(waitTask, "WT1");
		Thread t2=new Thread(waitTask, "WT2");
		Thread t3=new Thread(waitTask, "WT3");
		Thread t4=new Thread(notifyTask, "NT1");
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(200);
		
		t4.start();
	}

}
