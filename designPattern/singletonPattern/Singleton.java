package designPattern.singletonPattern;

public class Singleton {

	private static Singleton instance=null;
	
	// Making Constructor Private
	private Singleton(){}
	
	public static Singleton getInstance(){
		//Lazy Initialisation
		if(instance==null){
			// Double Check Locking
			synchronized(Singleton.class){
				if(instance==null)
					instance=new Singleton();
				System.out.println("Creating First time");
			}
		}
		else
		System.out.println("Already existed Object return");
	
		return instance;
	}
	
	public void showWork(){
		System.out.println("Working "+instance.hashCode());
	}
	
	
}
