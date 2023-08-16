package probelms;
import java.util.Arrays;
import java.util.HashSet;

public class MaxNumberOfIntegersToChooseFromARangeICaluclator {
	private HashSet<Integer> storageOfNumbers;
	private int[] bannedNumbers;
	private int range;
	private int maxLimit;
	
	public MaxNumberOfIntegersToChooseFromARangeICaluclator(int[] bannedNumbers, int maxLimit, int range) {
		storageOfNumbers = new HashSet<>();
		this.maxLimit = maxLimit;
		this.bannedNumbers = bannedNumbers;
		this.range = range;
	}
	
	public int calculate() {
		fillHashSet(this.storageOfNumbers,this.range);
		removeBannedNumbersFromHashSet(storageOfNumbers, this.bannedNumbers);
		Integer[] setToArray = Arrays.copyOf(storageOfNumbers.toArray(), storageOfNumbers.size(), Integer[].class);
		int maxValues = findMaxSumNumberOfIntegersLessThanMaxLimit(this.maxLimit,setToArray);
		return maxValues;
		 
	}
	
	private int findMaxSumNumberOfIntegersLessThanMaxLimit(int maxLimit2, Integer[] setToArray) {
		int window = 0;
        int res = 0;
        for(int start = 0; start < setToArray.length; start++) {
           res += setToArray[start];
           window++;
           if(res > maxLimit2) {
               res -= setToArray[start];
               window--;
               break;
           }
        }

        return window;
		
	}
	
	private void removeBannedNumbersFromHashSet(HashSet<Integer> storageOfNumbers2, int[] bannedNumbers2) {
		for(int number: bannedNumbers2) {
            if(storageOfNumbers2.contains(number)) {
            	storageOfNumbers2.remove(number);
            }
        }
		
	}
	
	private void fillHashSet(HashSet<Integer> storageOfNumbers2, int range2) {
		for(int start = 1;  start <= range2; start++) {
			storageOfNumbers2.add(start);
        }
		
	}
}
