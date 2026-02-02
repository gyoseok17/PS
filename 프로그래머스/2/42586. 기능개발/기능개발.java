import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> dueDays = new ArrayDeque();
        for (int i = 0; i < speeds.length; i++) {
            int dueDay = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            dueDays.add(dueDay);
        }
        
        List<Integer> list = new ArrayList<>();
        int criterion = dueDays.poll();
        int count = 1;
        int size = dueDays.size();
        for (int i = 0; i < size; i++) {
            if (dueDays.peek() <= criterion) {
                dueDays.poll();
                count++;
                continue;
            }
            list.add(count);
            count = 1;
            criterion = dueDays.poll();
    
        }
        list.add(count);
        return list;
    }
}