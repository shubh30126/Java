package random;

public class SherlockPassword {

	static void printPassword(int no,int k){
		if(no==-1)
			System.out.println(no);
		else
		{
			System.out.println(k-no+" 5s and "+no+" 3s ");
			for(int i=1;i<=(k-no)/3;i++)
				System.out.print("555");
			for(int i=1;i<=(no)/5;i++)
				System.out.print("33333");	
            System.out.println();
		}
	}
	
	static int getPassword(int k){
		int i;
		if(k%3!=0){
		for(i=5;i<=(k);i+=5){
			if((k-i)%3==0)
				return i;
		}
		return -1;// In case of not possible
		}
		else
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int k=8;
    		 printPassword(getPassword(k),k);
	}
}
