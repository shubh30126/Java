package array;

import java.util.Arrays;

public class KthLargestElement {

	static void swap(int[] arr,int l,int r){
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
	}
	public static int partition(int[] arr, int l, int r)
	{
	    int pivot = arr[l];
	    int left = l, right = r;
	 
	    while (left < right)
	    {
	        while (arr[left] >= pivot && left < right)
	            left++;
	        while (arr[right] < pivot)
	            right--;
	        if (left < right)
	            swap(arr, left, right);
	    }
	 
	    swap (arr, l, right);
	    return right;
	}
	static int kthLargestElement(int[] arr,int l,int r,int k){
		
		if(k>0 && k<=r-l+1){
			
			int pos=partition(arr,l,r);
			if(pos-l==k-1){
				return arr[pos];
			}
			else if(pos-l<k-1){
				return kthLargestElement(arr, pos+1, r, k-(pos-l+1));
			}
			else {
				return kthLargestElement(arr, l, pos-1, k);
			}
					
		}
		else
			return Integer.MAX_VALUE;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr={2,4,1,6,3,7,5};
	    int arr[] = {12, 3, 5, 7, 4, 19, 26};
		int k=3;
		System.out.println(k+"th largest Element is" + kthLargestElement(arr,0,6,k));
		Arrays.sort(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}

}
