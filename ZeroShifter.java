package probelms;
/*
 * Given an array shift all zeros to the right.
 * If invalid return array with negative 1.
 * 
 */
public class ZeroShifter {
	
	public int[] shift(int[] input) {
		if(input.length == 0 || input == null) {
			return new int[] {-1};
		}
		
		int insertZerosIndex = 0;
		
		for(int number : input) {
			if(number != 0) {
				input[insertZerosIndex++] = number;
			}
		}
		
		while(insertZerosIndex < input.length) {
			input[insertZerosIndex++] = 0;
		}
		
		return input;
		
	}

}
