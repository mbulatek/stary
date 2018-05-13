package matrix;

public class Main {

	public static void main(String[] args) {
		int             n=64;
		Matrix			matrix = new Matrix(n);
		
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print(matrix.get(i, j) + " ");
			}
			System.out.println();
		}
	}
}
