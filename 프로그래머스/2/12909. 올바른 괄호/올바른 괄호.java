import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        if (!s.startsWith("(")) {
            return false;
        }
        
        Queue<Character> queue = new ArrayDeque<>();        
        queue.add(s.charAt(0));
        
        for (int i = 1; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                queue.add(c);
                continue;
            }
            queue.poll();
                
        }
        if (queue.isEmpty()){
            return true;
        }        
        return false;

    }
}