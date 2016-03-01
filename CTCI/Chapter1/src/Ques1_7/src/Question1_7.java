/*
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row
 * and column are set to 0.
 * 
*/
public class Question1_7 {
	public static void setZeros(int[][] array) {
		int r = array.length;
		int c = array[0].length;
		
		boolean[] row = new boolean[r];
		boolean[] col = new boolean[c];
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(array[i][j] == 0) {
					row[i] = true;
					col[i] = true;
				}
			}
		}
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(row[i] || col[j]) {
					array[i][j] = 0;
				}
			}
		}
	
		
	}	
	
}
