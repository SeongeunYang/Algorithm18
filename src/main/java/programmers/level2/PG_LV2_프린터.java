package programmers.level2;

import java.util.*;

public class PG_LV2_프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        List<int[]> printer = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
            int[] priWithIdx = {priorities[i], i};
            printer.add(priWithIdx);
        }

        while (!printer.isEmpty()) {
            boolean isHigh = false;
            for (int i = 1; i < printer.size(); i++) {
                // 우선순위가 더 높은 것이 존재하는지 체크
                if (printer.get(0)[0] < printer.get(i)[0]) {
                    isHigh = true;
                    break;
                }
            }

            if (isHigh) {
                // 뒤에 우선순위가 높은 게 있으면 젤 뒤로 보내주기
                int[] back = printer.get(0);
                printer.remove(0);
                printer.add(back);
            } else {
                // 내가 뽑고자 하는 거라면? return
                if (printer.get(0)[1] == location) {
                    return answer;
                }
                // 그렇지 않다면 프린트 한 후, 프린트 완료 개수 +1 해주기
                printer.remove(0);
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PG_LV2_프린터 method = new PG_LV2_프린터();
        int[] priorities = {1, 1, 9, 1, 1, 1};
        System.out.println(method.solution(priorities, 0));
    }
}
