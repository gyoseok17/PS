import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> deque = new ArrayDeque<>();
        final int maxSize = priorities.length;
            
        for(int i = 0; i < maxSize; i++) {
            int[] data = new int[2];
            data[0] = i;
            data[1] = priorities[i];
            deque.addLast(data);
        }
        int[] sortedPriorities = Arrays.stream(priorities)
        .boxed()
        .sorted(Collections.reverseOrder())
        .mapToInt(Integer::intValue)
        .toArray();
        
        int[] info = new int[2];
        int count = 0;
        for(int i = 0; i < maxSize; i++) {
            while(true) {
                info = deque.pollFirst();
                if(sortedPriorities[i] == info[1]) {
                    count++;
                    if(location == info[0]) {
                        return count;
                    }
                    break;
                }
                deque.addLast(info);
            }            
        }
        return -1;
    }
}