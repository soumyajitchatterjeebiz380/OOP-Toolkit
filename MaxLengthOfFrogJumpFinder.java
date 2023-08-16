package probelms;
/*
 * You are given a 0-indexed integer array stones sorted in strictly increasing order representing the positions of stones in a river.

A frog, initially on the first stone, wants to travel to the last stone and then return to the first stone. However, it can jump to any stone at most once.

The length of a jump is the absolute difference between the position of the stone the frog is currently on and the position of the stone to which the frog jumps.

More formally, if the frog is at stones[i] and is jumping to stones[j], the length of the jump is |stones[i] - stones[j]|.
The cost of a path is the maximum length of a jump among all jumps in the path.

Return the minimum cost of a path for the frog.
 */
public class MaxLengthOfFrogJumpFinder {

	public int maxJump(int[] stones) {
        if(stones.length == 2) {
            return Math.max(stones[0], stones[1]);
        }
        int maxLen = -1;
        for(int jumppos = 0; jumppos < stones.length; jumppos++) {
            if(jumppos+2 < stones.length) {
                maxLen = Math.max(maxLen, stones[jumppos+2] - stones[jumppos]);
            }
        }
        for(int jumpos = 1; jumpos < stones.length; jumpos++) {
            if(jumpos+2 < stones.length) {
                maxLen = Math.max(maxLen, stones[jumpos+2] - stones[jumpos]);
            }
        }

        return maxLen;
    }
}
