import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        Set<String> nonSpoilerWords = new HashSet<>();
        List<String> spoilerWords = new ArrayList<>();

        int startIndex = 0;
        for (int i = 0; i <= message.length(); i++) {
            if (i == message.length() || message.charAt(i) == ' ') {
                String word = message.substring(startIndex, i);
                int wStart = startIndex;
                int wEnd = i - 1;
                boolean spoiler = false;
                for (int[] range : spoiler_ranges) {
                    if (wStart <= range[1] && wEnd >= range[0]) {
                        spoiler = true;
                        break;
                    }
                }
                if (spoiler) spoilerWords.add(word);
                else nonSpoilerWords.add(word);
                startIndex = i + 1;
            }
        }

        Set<String> revealed = new HashSet<>();
        int count = 0;
        for (String word : spoilerWords) {
            if (!nonSpoilerWords.contains(word) && !revealed.contains(word)) {
                count++;
            }
            revealed.add(word);
        }
        return count;
    }
}