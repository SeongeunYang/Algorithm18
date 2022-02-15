package trenbi;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution2 {
    public int[] solution(int[] grade) {
        int[] answer = new int[grade.length];
        // 랭크를 부여한 학생들 수
        int ranked = 0;

        PriorityQueue<Integer> grades = new PriorityQueue<>(Collections.reverseOrder());
        for (int g : grade) {
            grades.add(g);
        }

        int rank = 1;
        int prevMax = 0;
        while (!grades.isEmpty()) {
            int max = grades.poll();

            if (max != prevMax) {
                prevMax = max;
                rank = ranked + 1;
            }
            int idx = findIndex(grade, max);
            grade[idx] = 0;

            answer[idx] = rank;
            ranked++;
        }

        return answer;
    }

    public int findIndex(int[] arr, int value) {
        int i = 0;
        while (i != arr.length) {
            if (arr[i] == value) {
                return i;
            }
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution2 method = new Solution2();
        int[] grade = {3,2,1,2};
        int[] result = method.solution(grade);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
