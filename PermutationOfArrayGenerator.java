package probelms;
import java.util.ArrayList;
import java.util.List;

public class PermutationOfArrayGenerator {
	
	int[] nums;

	public PermutationOfArrayGenerator(int[] nums) {
		super();
		this.nums = nums;
	}
	
	public List<List<Integer>> generate() {
		List<List<Integer>> alist = new ArrayList<>();
		generteHelper(this.nums, new ArrayList<Integer>(), alist);
		return alist;
	}

	private void generteHelper(int[] nums2, ArrayList<Integer> templist, List<List<Integer>> retList) {
		
		if(templist.size() == nums.length) {
            retList.add(new ArrayList<>(templist));
            return;
        }

        for(int i = 0; i < nums.length; i++ ) {
            if(nums[i] != -11) {
                templist.add(nums[i]);
                int temp = nums[i];
                nums[i] = -11;
                generteHelper(nums, templist, retList);
                nums[i] = temp;
                templist.remove(templist.size()-1);
            }
        }
		
	}
	
}
