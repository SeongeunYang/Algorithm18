package programmers.level1;

import java.util.ArrayList;

public class PG_LV1_모의고사 {
    public int[] solution(int[] answers) {
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        for (int i = 0; i < answers.length; i++) {
            //1번 수포자
            if (answers[i] == pattern1[i % 5]) {
                cnt[0]++;
            }
            //2번 수포자
            if (answers[i] == pattern2[i % 8]) {
                cnt[1]++;
            }
            //3번 수포자
            if (answers[i] == pattern3[i % 10]) {
                cnt[2]++;
            }
        }

        int maxScore = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        ArrayList<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (maxScore == cnt[i]) {
                maxList.add(i + 1);
            }
        }

        int[] answer = new int[maxList.size()];
        for(int i=0; i<maxList.size(); i++){
            answer[i] = maxList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        PG_LV1_모의고사 method = new PG_LV1_모의고사();
        int[] arr = {1, 3, 2, 4, 2};
        for (int i : method.solution(arr)) {
            System.out.print(i + " ");
        }
    }
}
