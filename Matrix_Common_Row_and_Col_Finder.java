package probelms;
import java.util.HashSet;

public class Matrix_Common_Row_and_Col_Finder {
	
	private int[][] matrixOne;
	
	private HashSet<String> pairStorage = new HashSet<>();
	
	public Matrix_Common_Row_and_Col_Finder(int[][] matrixOne) {
		this.matrixOne = matrixOne;
	}
	
	public int findCommonPairs() {
		
		append_row_pairs(pairStorage, matrixOne);
		
		int res = count_commom_cols_with_rows(pairStorage, matrixOne);
		
		return res;
	}

	private int count_commom_cols_with_rows(HashSet<String> pairStorage, int[][] matrixOne) {
		
		int count = 0;
		
		for(int col = 0; col < matrixOne.length; col++) {
			
			String hash = "";
			
			for(int row = 0; row < matrixOne.length; row++) {
				hash += String.valueOf(matrixOne[row][col]);
				hash += '+';
			}
			
			
			if(pairStorage.contains(hash)) {
				count += 1;
			}
			
		}
		
		return count;
		
	}

	private void append_row_pairs(HashSet<String> pairStorage, int[][] matrixOne) {
		
		for(int row = 0; row < matrixOne.length; row++) {
			
			String hash = "";
			
			for(int col = 0; col < matrixOne.length; col++) {
				hash += String.valueOf(matrixOne[row][col]);
				hash += '+';
			}
			
			pairStorage.add(hash);
			
		}
		
	}
}
