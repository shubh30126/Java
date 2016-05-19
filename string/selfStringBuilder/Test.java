package string.selfStringBuilder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1=new StringBuilder("Hello");
		String s2=new String("Hello");
		System.out.println("Previous HashCode of String = "+s2.hashCode());
		System.out.println(s2);
		s2=s2+" World ";
		System.out.println(s2);
		System.out.println("Later HashCode of String = "+s2.hashCode());
		System.out.println("\nPrevious HashCode of StringBuilder = "+s1.hashCode());
		System.out.println(s1.toString());
		s1.append(" World ");
		System.out.println(s1.toString());
		System.out.println("Later HashCode of StringBuilder = "+s1.hashCode());	
	}

}
