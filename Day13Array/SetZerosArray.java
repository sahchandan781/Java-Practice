package Day13Array;



import java.util.*;

class SetZerosArray {

	// Given an m x n matrix, if an element is 0, set its
	// entire row and column to 0.
	static void setZeroes(int[][] matrix)
	{

		int rows = matrix.length;
		int cols = matrix[0].length;

		// Iterate through each element of the matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				// If the element is 1, mark its
				// corresponding row and column using -1
				if (matrix[i][j] == 1) {

					// Mark all elements in the same column
					// as -1, except for other 1's
					int ind = i - 1;
					while (ind >= 0) {
						if (matrix[ind][j] != 1) {
							matrix[ind][j] = -1;
						}
						ind--;
					}
					ind = i + 1;
					while (ind < rows) {
						if (matrix[ind][j] != 1) {
							matrix[ind][j] = -1;
						}
						ind++;
					}

					// Mark all elements in the same row as
					// -1, except for other 1's
					ind = j - 1;
					while (ind >= 0) {
						if (matrix[i][ind] != 1) {
							matrix[i][ind] = -1;
						}
						ind--;
					}
					ind = j + 1;
					while (ind < cols) {
						if (matrix[i][ind] != 1) {
							matrix[i][ind] = -1;
						}
						ind++;
					}
				}
			}
		}

		// Iterate through the matrix again, setting all
		// -1's to 0
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] < 0) {
					matrix[i][j] = 1;
				}
			}
		}
	}

	// Test the setZeroes function with a sample input
	public static void main(String[] args)
	{
		int[][] arr = { { 1, 0, 2, 1 },
						{ 3, 4, 5, 2 },
						{ 0, 3, 0, 5 } };
		setZeroes(arr);
		System.out.println("The Final Matrix is:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
