package sorting;

public class QuickSort {
	
	static void quickSort(int [] arr,int low,int high){
		if(low<high){
		int pivot;
		pivot=partition(arr, low, high);
		for(int i=0;i<pivot;i++)
			System.out.print(arr[i]+" ");
		System.out.print(" ("+arr[pivot]+") ");
		for(int i=pivot+1;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		quickSort(arr, low, pivot-1);
		quickSort(arr, pivot+1, high);
		}
	}

	static void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static int partition(int[] arr, int l, int r)
	{
	    int pivot = arr[l];
	    int left = l, right = r;
	 
	    while (left < right)
	    {
	        while (arr[left] <= pivot && left < right)
	            left++;
	        while (arr[right] > pivot)
	            right--;
	        if (left < right)
	            swap(arr, left, right);
	    }
	 
	    swap (arr, l, right);
	    return right;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr={8,4,4,8,8,9};
		quickSort(arr, 0, arr.length-1);
		for(int i:arr)
			System.out.print(i);

	}

}
