package probelms;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaxNumberOfIntegersToChooseFromARangeCalculatorTester {
	
	private MaxNumberOfIntegersToChooseFromARangeICaluclator mnoftocfaric;
	private int[] bannedNumbers;
	private int maxSum;
	private int range;
	
	
	@Before
	public void setup() {
		this.bannedNumbers = new int[] {1, 6, 5};
		this.maxSum = 6;
		this.range = 5;
		this.mnoftocfaric = new MaxNumberOfIntegersToChooseFromARangeICaluclator(bannedNumbers, maxSum, range);
	}

	@Test
	public void testLengthOfBannedNumbers() {
		assertTrue("Test failure: Length of bannedNumbers array does not fit constraint",  this.bannedNumbers.length < 4);
	}
	
	@Test
	public void testifMaxSumRangeIsValid() {
		assertTrue("Test failure: MaxSum paramater does not fit constraint ",  this.maxSum < 8);
	}
	
	@Test
	public void testIfRangeIsValid() {
		assertTrue("Test failure: Range paramater does not fit constraint ",  this.range < 8);
	}
	
	@Test
	public void testCalculate() {
		assertEquals("The Output of the calculate function is incorrect", this.mnoftocfaric.calculate(),6);
	}

}
