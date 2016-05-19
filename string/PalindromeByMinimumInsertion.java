package string;

public class PalindromeByMinimumInsertion {
	
	static int minimum(String str,int low,int high){
		
		if(low<high){
			
			// If matches both end
			if(str.charAt(low)==str.charAt(high))
				return minimum(str,low+1,high-1);
			else{
				int l1=1+minimum(str,low,high-1);
				int l2=1+minimum(str,low+1,high);
				return l1>l2 ? l2:l1;
			}
						
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaaaa";
			System.out.println("Minimum insertion to be done is = "+minimum(str, 0, str.length()-1));

	}

}
