package random;

public class NoEnding1111 {

	public static void noEndingWith1111(int i){
		int rem=1;
		System.out.print(1);
		while(rem!=0){
			rem=(rem*10+1)%i;
			System.out.print(1);
		}
		
		
	}
	
	public static void main(String[] args) {

		int i=23;
		noEndingWith1111(i);
	}

}
