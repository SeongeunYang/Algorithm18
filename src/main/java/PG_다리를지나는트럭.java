import java.util.ArrayList;
import java.util.List;

public class PG_다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        List<Integer> trucks = new ArrayList<>();
        for (int truck : truck_weights) {
            trucks.add(truck);
        }

        List<int[]> onBridge = new ArrayList<>();
        int seconds = 0;
        int cur_weight = 0;
        while (!trucks.isEmpty()) {
            if (cur_weight + trucks.get(0) <= weight) {
                int[] addTruck = {trucks.get(0), 0};
                onBridge.add(addTruck);
                cur_weight += addTruck[0];
                trucks.remove(0);
            }

            // 다리 건너기...
            for (int i = 0; i < onBridge.size(); i++) {
                onBridge.get(i)[1] += 1;
            }
            // 다 도착하면 지워주기
            if (onBridge.get(0)[1] == bridge_length) {
                cur_weight -= onBridge.get(0)[0];
                onBridge.remove(0);
            }
            seconds++;
        }

        while (!onBridge.isEmpty()) {
            // 다리 건너기...
            for (int i = 0; i < onBridge.size(); i++) {
                onBridge.get(i)[1] += 1;
            }
            // 다 도착하면 지워주기
            if (onBridge.get(0)[1] == bridge_length) {
                cur_weight -= onBridge.get(0)[0];
                onBridge.remove(0);
            }
            seconds++;
        }

        return seconds + 1;
    }

    public static void main(String[] args) {
        PG_다리를지나는트럭 method = new PG_다리를지나는트럭();
        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(method.solution(2, 10, truck_weights));
    }
}
