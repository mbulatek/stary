package matrix;

import java.util.HashSet;

public class Matrix {
	int						size;
	public int[][]			data;
	static HashSet<Integer> powersOfTwo;	
	
	public Matrix(int size) {
		this.size = size;
		
		data = new int[size][size];
		
		/*
		 * 
		 */
		powersOfTwo = new HashSet<Integer>();
		powersOfTwo.add(1);
		powersOfTwo.add(2);
		powersOfTwo.add(4);
		powersOfTwo.add(8);
		powersOfTwo.add(16);
		powersOfTwo.add(32);
		powersOfTwo.add(64);
		powersOfTwo.add(128);
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ( powersOfTwo.contains(i^j) ) {
					data[i][j] = 1;
				} else {
					data[i][j] = 0;
				}
			}
		}
	}
	
	public Matrix mult(Matrix m) {
		Matrix result = new Matrix(size);
		
		/*
		 * First matrix: data[i][j]
		 * Second matrix: m.get(i,j)
		 * Result: result.set(i, j, value)
		 * Example:
		 * int value;
		 * value = data[i][j] * m.get(i,j);
		 * result.set(i, j, value);
		 */
		

		
		
		return result;
	}
	
	public void set(int n, int m, int val) {
		data[n][m] = val;
	}
	
	public int get(int n, int m) {
		return data[n][m];
	}
}
