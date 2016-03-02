/*
 * Given an image represented by an NxN matrix, where each pixel in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
 * place?
 * 
 * */
  
public class Question1_6 {
	
	/* copy top -> left -> bottom -> left using a temp array 0(n) space
	 * temp[n] = top
	 * 
	*/
	
	//public static void rotateBasic(int[][] array, int N) {
	
	// swap index by index - Gayle's solution
	public static void rotate(int[][] array, int N) {
		for(int layer = 0; layer < N/2; ++layer) {
			int first = layer;
			int last = N - 1 - first;
			
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				
				int top = array[layer][i]; // save top
				array[layer][i] = array[last-offset][layer]; //left -> top
				array[last-offset][layer] = array[last][last-offset]; //bottom -> left
				array[last][last-offset] = array[first][last]; //right -> left
				array[i][last] = top; //top -> left
			}
			
		}	
	}
	
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(10, 10, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix, 10);
		//rotateBasic(matrix, 10);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}

}
