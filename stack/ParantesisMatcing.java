package stack;

import java.util.*;

public class ParantesisMatcing {

	public static boolean isMatching(char a,char b){
		if(a=='(' && b==')')
			return true;
		else if(a=='[' && b==']')
			return true;
		else if(a=='{' && b=='}')
			return true;
		else 
			return false;
	}
	
	public static boolean isBalanced(String exp){
		Stack<Character> st=new Stack<Character>();
		
		for(int i=0;i<exp.length();i++){
			char item=exp.charAt(i);
			if(item=='(' || item=='{' || item=='[')
			st.push(item);
			else{
				if(!st.empty()){
				if(!isMatching(st.pop(), item))
					return false;
				}
				else
					return false;
			}
		}
		
		if(st.empty())
			return true;
		else 
			return false;
		
	}
	
	public static void main(String[] args) {
		
		//String exp="[()]{}{[()()]()}";
		String exp="[(])";
	System.out.println(isBalanced(exp));	
	}

}
