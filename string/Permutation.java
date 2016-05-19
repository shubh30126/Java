package string;

public class Permutation {

	static int count=0;
	static void permutation(String s)
	{
		permutation("", s);
	}
	
	static void permutation(String prefix, String s)
	{
		int len=s.length();
		if(len==0){
			System.out.println(prefix);
			count++;
		}
		for(int i=0;i<len;i++)
		permutation(prefix+s.charAt(i),s.substring(0, i)+s.substring(i+1,len));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abc";
		permutation(s);
System.out.println("Total count = "+count);
	}

}
