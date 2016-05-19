package string;

public class KMP {
	
	static int[] lps;
	
	static void computeLPS(char[] pat){

		int patLen=pat.length;
		lps=new int[patLen];
		int i=1,j=0;
		lps[0]=0;
		
		while(i<patLen)
		{
			if(pat[j]==pat[i])
			{
				j++;
				lps[i]=j;
				i++;
			}
			else //pat[j]!=pat[i]
			{
				if(j>0)
					j=lps[j-1];
				else
					lps[i++]=0;
			}
		}
		
	}
	
	static void searchKMP(char[] text,char[] pat){
		int i=0,j=0;
		int textLen=text.length,patLen=pat.length;
		
		while(i<textLen)
		{
			if(text[i]==pat[j])
			{
				i++;
				j++;
			}
			if(j==patLen)
			{
				System.out.println("Pattern found at "+(i-j));
				j=lps[j-1];
			}
			else if(i<textLen && text[i]!=pat[j])
			{
				if(j!=0)
					j=lps[j-1];
				else
					i++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="ABABDABACDABABCABAB";
		String pat="ABABCABAB";
		computeLPS(pat.toCharArray());
		searchKMP(text.toCharArray(), pat.toCharArray());
		
	}

}
