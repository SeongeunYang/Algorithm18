import java.util.*;

public class PG_프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        List<int[]> printer = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
            int[] priWithIdx = {priorities[i], i};
            printer.add(priWithIdx);
        }

        int idx = location;
        while (!printer.isEmpty()) {
            boolean isHigh = false;
            for (int i = 1; i < printer.size(); i++) {
                if (printer.get(0)[0] < printer.get(i)[0]) {
                    isHigh = true;
                    break;
                }
            }

            if (isHigh) { // 뒤에 우선순위가 높은 게 있으면
                int[] back = printer.get(0);
                printer.remove(0);
                printer.add(back);
            } else {
                if (printer.get(0)[1] == location) {
                    return answer;
                }
                printer.remove(0);
                answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        PG_프린터 method = new PG_프린터();
        int[] priorities = {1, 1, 9, 1, 1, 1};
        System.out.println(method.solution(priorities, 0));
    }
}
