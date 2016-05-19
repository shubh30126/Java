package array;

import java.util.HashMap;

public class DoubletSumExist {

	public static boolean hasDoublet(int[] Arr,int sum){
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<Arr.length;i++){	
			int temp=sum-Arr[i];
			if(hm.get(temp)!=null)
				return true;
			else
				hm.put(Arr[i], Arr[i]);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[] = {1, 4, 45, 6, 10, 8};
        int sum = 100;
        System.out.println(hasDoublet(Arr, sum));
	}

}
