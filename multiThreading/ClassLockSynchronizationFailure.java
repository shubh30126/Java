package multiThreading;

class Table1{
	
	public synchronized void print(int n){
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

class MyThread1 extends Thread{
	Table1 t;

	public MyThread1(Table1 t) {
		super();
		this.t = t;
	}
	
	public void run(){
		t.print(1);
	}
}

class MyThread2 extends Thread{
	Table1 t;

	public MyThread2(Table1 t) {
		super();
		this.t = t;
	}
	public void run(){
		t.print(2);
	}
	
}

class MyThread3 extends Thread{
	Table1 t;

	public MyThread3(Table1 t) {
		super();
		this.t = t;
	}
	public void run(){
		t.print(3);
	}
}

public class ClassLockSynchronizationFailure {

	public static void main(String[] args) {

		Table1 t=new Table1();

		Table1 ta=new Table1(); // another object so  t1 and t3 shows interference
		MyThread1 t1=new MyThread1(t);
		MyThread2 t2=new MyThread2(t);
		MyThread3 t3=new MyThread3(ta);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
