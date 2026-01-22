import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        int newNum = -1;
        
        for (int el : arr) {
            if (newNum != el) {
                newNum = el;
                answer.add(el);    
            }
        }

        return answer.stream()
                    .mapToInt(i -> i)
                    .toArray();
    }
}