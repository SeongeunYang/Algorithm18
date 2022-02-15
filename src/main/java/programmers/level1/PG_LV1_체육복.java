package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PG_LV1_체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> reserveList = new ArrayList<>();
        for (int i : reserve) {
            reserveList.add(i);
        }
        Collections.sort(reserveList);

        List<Integer> lostList = new ArrayList<>();
        for (int i : lost) {
            if (reserveList.contains(i)) {
                int idx = reserveList.indexOf(i);
                reserveList.remove(idx);
            } else {
                lostList.add(i);
            }
        }
        Collections.sort(lostList);

        int addStdCnt = 0;
        for (int student : lostList) {
            if (reserveList.contains(student - 1)) {
                int idx = reserveList.indexOf(student - 1);
                reserveList.remove(idx);
                addStdCnt += 1;
            } else if (reserveList.contains(student + 1)) {
                int idx = reserveList.indexOf(student + 1);
                reserveList.remove(idx);
                addStdCnt += 1;
            }
        }

        int answer = n - lostList.size() + addStdCnt;
        return answer;
    }

    public static void main(String[] args) {
        PG_LV1_체육복 method = new PG_LV1_체육복();
        int[] lost = {2, 4, 5};
        int[] reserve = {3, 5};
        System.out.println(method.solution(5, lost, reserve));
    }
}
