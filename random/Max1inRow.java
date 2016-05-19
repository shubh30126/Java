package random;

public class Max1inRow {

	public static int rowWithMax1(int[][] max){
		
		int row=max.length;
		int col=max[0].length;
		int maxRow=0;
		int i=0,j=0;
		
		while(i<row && j<col){
			if(max[i][j]==0)
			i++;
			else
			{
				j++;
				maxRow=i;
			}
		}
		
		return maxRow;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][] = { {1, 1, 1, 0},
		        {1, 0, 0, 0},
		        {0, 0, 0, 0},
		        {1, 1, 1, 1}
		    };
		
		System.out.println(rowWithMax1(mat));
	}

}
