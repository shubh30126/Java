package string.selfStringBuilder;
import java.util.*;

public class StringBuilder {

	List<Character> value;
	
 public StringBuilder(String s) {
	// TODO Auto-generated constructor stub
	 value=new ArrayList<Character>();
	 char[] arr=s.toCharArray();
	 for(int i=0;i<arr.length;i++)
		 value.add(arr[i]);
 }


public void append(String s){
	
	char[] arr=s.toCharArray();
	 for(int i=0;i<arr.length;i++)
		 value.add(arr[i]);	
}

public String toString(){
	Iterator<Character> i=value.iterator();
	String s="";
	while(i.hasNext())
		s+=i.next();

return s;
}
}