package multiThreading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {

		ExecutorService exec=Executors.newFixedThreadPool(10);
		for(int i=5;i>=1;i--){
			Runnable r=new WorkerThread("Worker Thread"+i);
			exec.execute(r);
		}
		
		exec.shutdown();
		while(!exec.isTerminated()){}
		
		System.out.println("Finished all threads");
		
	}

}
