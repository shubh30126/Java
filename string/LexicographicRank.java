package string;

public class LexicographicRank {
	
	static int fact(int n){
		if(n==1 || n==0)
			return 1;
		return n*fact(n-1);
	}
	static int smallerInRight(char[] txt,int start,int end){
		
		int onRight=0;
		
		for(int i=start+1;i<=end;i++){
			if (txt[start]>txt[i])
				onRight++;
		}
		
		return onRight;
	}

	static int lexicographicRank(String s){
		
		int mul=fact(s.length());
		int rank=0;
		char[] txt=s.toCharArray();
		int n=txt.length;
		
		for(int i=0;i<n;i++)
		{
			mul=(mul/(n-i));
			rank=rank+(mul)*smallerInRight(txt, i, n-1);
		}
		
		return rank;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="string";
		
		// Value of rank starting with 1 so adding 1
		
		System.out.println(lexicographicRank(s)+1);
		

	}

}
