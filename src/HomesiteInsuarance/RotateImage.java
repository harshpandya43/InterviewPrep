package HomesiteInsuarance;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateImage r = new RotateImage();
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		r.rotateImage(matrix);
		
	}
	
	public void rotateImage(int[][] matrix) {
		int n = matrix.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-j-1];
				matrix[i][n-j-1] = temp; 
			}
		}
	}

}
