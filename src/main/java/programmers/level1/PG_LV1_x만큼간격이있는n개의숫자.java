package programmers.level1;

import java.util.Arrays;

public class PG_LV1_x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1); //등차수열과 같다. an =  a + n*d
        }
        return answer;
    }

    public static void main(String[] args) {
        PG_LV1_x만큼간격이있는n개의숫자 method = new PG_LV1_x만큼간격이있는n개의숫자();
        long[] result = method.solution(2, 5);
        System.out.println(Arrays.toString(result));
    }
}
