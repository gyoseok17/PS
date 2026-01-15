import java.util.*;
    
class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {    
            numsSet.add(num);
        }
        return Math.min(numsSet.size(), nums.length / 2);
    }
}