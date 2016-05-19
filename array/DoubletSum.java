package array;

import java.util.HashMap;
import java.util.HashSet;

public class DoubletSum {

	static int findPairs(int[] a,int k){
		int count=0;
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		HashSet<Integer> s=new HashSet<Integer>();
		for(int i=0 ; i<a.length;i++){
			int temp=k-a[i];
			String key=""+temp;
			if(hm.get(key)!=null){
				if(temp!=a[i]){
				s.add(temp);
				s.add(a[i]);}
				else
					count++;
			}
				hm.put(a[i]+"", a[i]);
		}		
		return s.size()/2+count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,3,2,3,1,4,0,2,3,3,3,1,1,1,6};
		int k=4;
		System.out.println("Distinct Pairs are "+findPairs(a, k));
	}

}
