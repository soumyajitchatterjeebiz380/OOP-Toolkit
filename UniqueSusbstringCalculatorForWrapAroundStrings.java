package probelms;

public class UniqueSusbstringCalculatorForWrapAroundStrings {
	
	String input;
	int[] cache;
	
	public UniqueSusbstringCalculatorForWrapAroundStrings(String input) {
		checkIfInputIsValid(input);
		this.input = input;
		this.cache = new int[26];
	
	}
	
	private void checkIfInputIsValid(String input) throws IllegalArgumentException {
		//Throw exception if input contains Uppercase letters or numbers
	    //Throw exception if the input size is too big
		// Throw exception if input is null
		try {
			for(char letter : input.toCharArray()) {
				if((int) letter < 97 || (int) letter > 122 ) {
					throw new IllegalArgumentException("Input has invalid values (MUST BE BETWEEN a-z)");
				}
			}
			if(input.length() > 12) {
				throw new IllegalArgumentException("Input is too long(MUST BE LENGTH LESS THAN 13)");
			}
		}catch(NullPointerException e) {
			throw new IllegalArgumentException("Input cannnot be null (MUST BE A NON NULL VALUE)");
		}
	}

	public int calculateSubstring() {
		
		int counter = 0;
		
		for(int start = 0; start < input.length(); start++) {
			
			if(start > 0 && (input.charAt(start) - input.charAt(start-1) == 1 || input.charAt(start-1) - input.charAt(start-1) == 25)) {
				
				counter++;
				
			}else {
				
				counter = 1;
				
			}
			
			int idx = calculateIdx(start, input);
			cache[idx] = Math.max(cache[idx], counter); 
			
		}
		
		
		int sum = calculateSum(cache);
		
		return sum;
		
	}

	private int calculateSum(int[] cache2) {
		int res = 0;
		for(int num : cache2) {
			res += num;
		}
		return res;
	}

	private int calculateIdx(int start, String input2) {
		return input2.charAt(start) - 'a';
	}
}
