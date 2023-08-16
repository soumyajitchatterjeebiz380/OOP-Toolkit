package probelms;
/*You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.

*/

public class minCostClimbingStairsCalculator {
	
	int[] cost_input;
	int[] cache;

	public minCostClimbingStairsCalculator(int[] cost_input) {
		super();
		this.cost_input = cost_input;
		this.cache = new int[cost_input.length+1]; 
	}
	
	public int calculate() {
		if(cost_input.length == 2) return Math.min(cost_input[0], cost_input[1]);
		cache[cache.length-1] = 0;
        cache[cache.length-2] = cost_input[cost_input.length-1];
        for(int i = cache.length - 3; i >= 0; i--) {
            cache[i] = Math.min(cost_input[i] + cache[i+1], cost_input[i] + cache[i+2]);
        }
        return Math.min(cache[0], cache[1]);
		
	}

}
