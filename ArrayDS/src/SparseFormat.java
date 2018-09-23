import java.util.Scanner;

public class SparseFormat {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and column size:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] sparseMatrix = new int[row][col];
		int sparseFormatSize = 0;
		System.out.println("Please enter the elements into the matrix:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sparseMatrix[i][j] = sc.nextInt();
				if (sparseMatrix[i][j] != 0) {
					sparseFormatSize++;
				}
			}
		}
		System.out.println(sparseFormatSize + "= sparseFormatSize");
		int sfRow = 0;
		/* reading the matrix to find out the non zero element */
		int sparseFormat[][] = new int[sparseFormatSize][3];
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < col ; j++) {
				if (sparseMatrix[i][j] != 0) {

					sparseFormat[sfRow][0] = i;
					sparseFormat[sfRow][1] = j;
					sparseFormat[sfRow][2] = sparseMatrix[i][j];
					sfRow++;

				}
			}
		}
		for (int i = 0; i < sparseFormatSize ; i++) {
			for (int j = 0; j < 3 ; j++) {
				System.out.print(sparseFormat[i][j] +" ");
			}
			System.out.println();
		}
	}
}
