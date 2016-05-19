package multiThreading.threadPool;

public class WorkerThread implements Runnable {

	String message;
	public WorkerThread(String message) {
		this.message=message;
	}

	public void processMessage() {
	
		try {
			System.out.println(message);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" starts ");
		processMessage();
		System.out.println(Thread.currentThread().getName()+" ends ");		
		
	}

}
