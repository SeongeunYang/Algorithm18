package programmers.level1;

public class PG_LV1_소수만들기 {
    public int solution(int[] nums) {
        int answer = -1;
        int len = nums.length;
        boolean[] visited = new boolean[len];
        return combination(nums, visited, 0, len, 3, 0);
    }

    static int combination(int[] arr, boolean[] visited, int start, int n, int r, int cnt) {
        if (r == 0) {
            int sum = 0;
            boolean isprime = true;
            for (int i = 0; i < n; i++) { //3가지 고른 것을 더하기!!
                if (visited[i] == true) {
                    sum += arr[i];
                }
            }
            for (int i = 2; i < sum / 2; i++) { //소수 판별
                if (sum % i == 0) {
                    isprime = false;
                }
            }
            if (isprime) cnt++; //소수라면 카운트해주기

            return cnt;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            cnt = combination(arr, visited, i + 1, n, r - 1, cnt);
            visited[i] = false;
        }

        return cnt;
    }

    public static void main(String[] args) {
        PG_LV1_소수만들기 method = new PG_LV1_소수만들기();
        int[] arr = {1, 2, 7, 6, 4};
        System.out.println(method.solution(arr));
    }
}
