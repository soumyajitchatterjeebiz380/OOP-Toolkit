package probelms;

/*
 * Given a string s, return the longest 
	palindromic substring in s.
 * 
 * 
 */
public class longestPalindromeGenerator {
	String input;
	String[][] cache;
	int longest_len = -1;
	String longestPalindrome = "";

	public longestPalindromeGenerator(String input) {
		super();
		this.input = input;
		this.cache = new String[input.length()][input.length()];
	}
	
	public String generate() {
		generatePalindromeLenOfOne();
		generateLongestPalindromeMoreThanLenOne();
		return longestPalindrome;
	}

	private void generateLongestPalindromeMoreThanLenOne() {
		for(int cols = 1; cols < input.length(); cols++) {
            for(int rows = 0; rows < cols; rows++) {
                if(cols - rows == 1 && input.charAt(rows) == input.charAt(cols)) {
                     cache[rows][cols] = String.valueOf(input.charAt(rows)) + String.valueOf(input.charAt(cols));
                     if(cache[rows][cols].length() > longest_len) {
                         longest_len = cache[rows][cols].length();
                         longestPalindrome = cache[rows][cols];
                     }
                }else if(input.charAt(rows) == input.charAt(cols) && cache[rows+1][cols-1] != null) {
                     cache[rows][cols] = input.charAt(rows) + cache[rows+1][cols-1] + input.charAt(cols);
                     if(cache[rows][cols].length() > longest_len) {
                         longest_len = cache[rows][cols].length();
                         longestPalindrome = cache[rows][cols];
                     }
                     
                }else{
                    cache[rows][cols] = null;
                }
            }
        }
		
	}

	private void generatePalindromeLenOfOne() {
		for(int idx = 0; idx <input.length(); idx++) {
			cache[idx][idx] = String.valueOf(input.charAt(idx));
			longest_len = 1;
	        longestPalindrome = String.valueOf(input.charAt(idx));
		}
		
	}
}
