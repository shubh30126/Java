package string;

public class PrintZigZag {

	static String printZigZag(String s,int n){
		char[] arr=s.toCharArray();
		String[] res=new String [n];
		char dir='D';
		for(int i=0;i<n;i++)
		res[i]="";
		for(int i=0,row=0;i<arr.length;i++)
		{
			res[row]+=arr[i];
			if(row==n-1)
				dir='U';
			if(row==0)
				dir='D';
			if(dir=='U')
				row--;
			if(dir=='D')
				row++;
		}
		
		
		
		String result="";
		for(String s1:res){
			result+=s1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ABCDEFGH";
		System.out.println(printZigZag(str,2));
	}

}
