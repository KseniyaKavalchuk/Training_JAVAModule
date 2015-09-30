package transpositionOfMatrix;

public class Transponate {

	public static void main(String[] args) {
		
		int [] [] matrix = new int [3] [];
		int transpMatrix [] [] = new int [3] [];
		
		System.out.println("Matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			matrix [i] = new int [3];
			transpMatrix [i] = new int [3];
			for (int j = 0; j < matrix[i].length; j++) {
				matrix [i] [j] = (int)Math.round(Math.random()*100);
				System.out.print(matrix [i] [j] + "    ");
			}
		System.out.println();
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				transpMatrix [i] [j] = matrix [j][i];
			}
		}

		System.out.println("Transponated matrix: ");
		for (int i = 0; i < transpMatrix.length; i++) {
			for (int j = 0; j < transpMatrix[i].length; j++) {
				System.out.print(transpMatrix [i] [j] + " ");
			}
			System.out.println();
		}
		

	}

}
