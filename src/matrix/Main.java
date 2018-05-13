package matrix;

public class Main {

	public static void main(String[] args) {
		Matrix			matrix = new Matrix(32);
		
		for (int j = 0; j < 32; j++) {
			for (int i = 0; i < 32; i++) {
				System.out.print(matrix.get(i, j) + " ");
			}
			System.out.println();
		}
	}
}
