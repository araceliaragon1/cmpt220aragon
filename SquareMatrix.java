// Lab 5 - Problem 7

import java.util.*;

public class SquareMatrix {
	
	private static final int N = 3; 
	
	public static boolean isUpperTriangularMatrix(int mat [][]) {
		for(int i = 1; i < N; i ++) {
			for(int k = 0; k < i; k++) {
				if (mat[i][k] != 0) {
					return false; 
				}
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] mat = {{2, 1, 4},
					   {0, 3, -1},
					   {0, 0, -2}};
		if(isUpperTriangularMatrix(mat)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
