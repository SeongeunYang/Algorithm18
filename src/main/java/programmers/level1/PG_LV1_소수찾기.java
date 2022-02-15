package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class PG_LV1_소수찾기 {
    List<Integer> prime;

    public int solution(int n) {
        prime = new ArrayList<>();
        int[] notPrime = new int[n + 1];

        for (int i = 2; i < n + 1; i++) {
            if (notPrime[i] != 1) {
                checkPrime(i);
            }

            for (int j = i; j < n + 1; j += i) {
                notPrime[j] = 1;
            }
        }

        return prime.size();
    }

    public void checkPrime(int num) {
        for (int n : prime) {
            if (n > Math.sqrt(num)) {
                break;
            } else if (num % n == 0) { // 특정 숫자와 나누어 떨어진다면 소수가 아님
                return;
            }
        }
        prime.add(num);
    }

    public static void main(String[] args) {
        PG_LV1_소수찾기 method = new PG_LV1_소수찾기();
        System.out.println(method.solution(5));
    }
}
