package probelms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GeneratePermutationCaluclator {
	/*
	 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
	   A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
	 * 
	 * 
	 * 
	 */
	
	private String digits;
	private HashMap<Character, ArrayList<Character>> amap;
	List<String> retList; 
	public GeneratePermutationCaluclator(String digits) {
		this.digits = digits;
		amap = new HashMap<>(); 
		retList = new ArrayList<>();
	}
	
	public List<String> generatePermutations() {
		populate(amap);
		generatePermutationsHelper(0, "");
		return this.retList;
	}

	private void generatePermutationsHelper(int idx, String currString) {
		if(idx >= digits.length()) {
            this.retList.add(currString);
            return;
        }

        Character extract = digits.charAt(idx);
        for(Character c : amap.get(extract)) {
            String temp = currString;
            currString += c;
            generatePermutationsHelper(idx+1, currString);
            currString = temp;
        }   
	}

	private void populate(HashMap<Character, ArrayList<Character>> amap) {
		// TODO Auto-generated method stub
		 	this.amap.put('2',new ArrayList<Character>(Arrays.asList('a', 'b','c')));
	        this.amap.put('3',new ArrayList<Character>(Arrays.asList('d', 'e','f')));
	        this.amap.put('4',new ArrayList<Character>(Arrays.asList('g', 'h','i')));
	        this.amap.put('5',new ArrayList<Character>(Arrays.asList('j', 'k','l')));
	        this.amap.put('6',new ArrayList<Character>(Arrays.asList('m', 'n','o')));
	        this.amap.put('7',new ArrayList<Character>(Arrays.asList('p', 'q','r','s')));
	        this.amap.put('8',new ArrayList<Character>(Arrays.asList('t', 'u','v')));
	        this.amap.put('9',new ArrayList<Character>(Arrays.asList('w', 'x','y','z')));
		
	}
}	
