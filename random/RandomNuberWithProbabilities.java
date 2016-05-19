package random;

import java.util.Random;

public class RandomNuberWithProbabilities {

	static int getRandom(double[] prob){
		int no;
		Random r=new Random();
		no=Math.abs((r.nextInt()%100));
		int r1=(int)(prob[0]*100);
		int r2=(int)(prob[1]*100);
		int r3=(int)(prob[2]*100);
		if(no>=0 && no<r1)
			no=1;
		else if(no>=r1 && no<r1+r2)
			no=2;
		else if(no>=r1+r2 && no<r1+r2+r3)
			no=3;
		return no;
	}
	
	public static void main(String[] args) {
		
		double[] prob={0.8,0.1,0.1};
		for(int i=0;i<10;i++){
			System.out.println(getRandom(prob));
		}
		
	}

}
