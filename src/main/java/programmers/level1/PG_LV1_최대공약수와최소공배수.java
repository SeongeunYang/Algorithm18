package programmers.level1;

import java.util.Arrays;

public class PG_LV1_최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = {n, m};
        int max = n, min = m;
        int remainder;
        if (n == m) {
            return answer;
        } else if (m > n) {
            max = m;
            min = n;
        }

        while (min != 0) { //나머지가 있으면
            remainder = max % min; // 큰수에서 작은 수를 나눈 나머지
            max = min; //나눠질 수를 설정
            min = remainder; //나눌 수를 설정
        }
        answer[0] = max; //최대공약수
        answer[1] = max * (n / max) * (m / max); //최대공약수로 나눈 몫끼리 곱 * 최대공약수 하면 최소공배수!!

        return answer;
    }

    public static void main(String[] args) {
        PG_LV1_최대공약수와최소공배수 method = new PG_LV1_최대공약수와최소공배수();
        System.out.println(Arrays.toString(method.solution(2, 12)));
    }
}
