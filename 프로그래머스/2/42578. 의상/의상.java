import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int result = 1;
        HashMap<String, Integer> clothesMap = new HashMap<>();
        
        for (String[] cloth : clothes) {
            clothesMap.put(cloth[1], clothesMap.getOrDefault(cloth[1], 0) + 1);
        }
        for (int c : clothesMap.values()) {
            result *= c + 1;
        }
        return result - 1;
    }
}