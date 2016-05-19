package multiThreading;

class Table{
	
	public static synchronized void print(int n){
	for(int i=0;i<5;i++){
			
			System.out.println(n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}		
	}
}

public class ClassLockSynchronization {

	public static void main(String[] args) {

		Thread t1=new Thread(){
			public void run(){
				Table.print(1);
			}
		};

		Thread t2=new Thread(){
			public void run(){
				Table.print(2);
			}
		};

		Thread t3=new Thread(){
			public void run(){
				Table.print(3);
			}
		};

		Thread t4=new Thread(){
			public void run(){
				Table.print(4);
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
