import java.util.*;

class Solution {
    class Truck {
        private int weight;
        private int location;
        
        public Truck(int w) {
            this.weight = w;
            this.location = 1;
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Truck> bridge = new ArrayDeque<>();
        
        int i = 0;
        int time = 0;
        while(i < truck_weights.length) {
            time++;
            if(bridge.isEmpty()) {
                Truck newTruck = new Truck(truck_weights[i]);
                bridge.addLast(newTruck);
                i++;
                continue;
            }
            int weightSum = 0;
            for(Truck t : bridge) {
                t.location++;
                weightSum += t.weight;
            }
            if(bridge.peekFirst().location == bridge_length) {
                bridge.pollFirst();
            }
            if(bridge.size() <= bridge_length && weightSum + truck_weights[i] <= weight) {
                Truck newTruck = new Truck(truck_weights[i]);
                bridge.addLast(newTruck);
                i++;
            }
        }
        
        return time + bridge_length;
    }
}