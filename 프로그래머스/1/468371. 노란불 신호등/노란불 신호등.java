import java.util.*;

class Solution {
    public int solution(int[][] signals) {
        int answer = 0;
        List<SignalCheck> SignalCheckList = new ArrayList<>();
        
        int vLcm = 1;
        for(int[] signal : signals) {
            SignalCheckList.add(new SignalCheck(signal));
            vLcm = lcm(vLcm, signal[0] + signal[1] + signal[2]);
        }
        
        int c;
        int t = 0;
        while(t < vLcm+1) {
            t++;
            c = 0;
            for(SignalCheck SC : SignalCheckList) {
                if(SC.check(t)) {
                    c++;
                }
            }
            if(c == SignalCheckList.size()){
                return t;
            }
        }
        return -1;
        
    }
    
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
class SignalCheck {
    int g;
    int y;
    int r;
    
    public SignalCheck(int[] signal) {
        this.g = signal[0];
        this.y = signal[1];
        this.r = signal[2];
    }
    
    // q초 후 w동안 q+w+e 주기 
    public boolean check(int t) {
        int condition = t % (g+y+r) - g - 1; // -1 없으면 t초 후 값 계산 원하는 건 (t-1)~t일 때 값
        return condition >= 0 && condition < y;
    }
    
}
