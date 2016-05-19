package designPattern.singletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj=Singleton.getInstance();
		obj.showWork();
		Singleton obj1=Singleton.getInstance();
		obj1.showWork();
		
	}

}
