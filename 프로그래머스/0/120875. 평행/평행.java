class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int[] p1 = dots[0];
        for (int i=1; i<4; i++) {
            int[] p2 = dots[i];
            for (int j=2; j<4; j++) {
                if (j==i) continue;
                int[] p3 = dots[j];
                int[] p4 = dots[6-(i+j)];
                if (compare(p1, p2, p3, p4)) return 1;
            }
        }
        return 0;
    }
    private boolean compare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int x1 = p2[0] - p1[0];
        int y1 = p2[1] - p1[1];
        
        int x2 = p4[0] - p3[0];
        int y2 = p4[1] - p3[1];
        
        if (x2*y1 == x1*y2) return true;
        return false;
    }
}