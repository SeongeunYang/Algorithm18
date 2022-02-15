package programmers.level1;

public class PG_LV1_나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = n - 1;
        for (int i = 2; i < n; i++) {
            if ((n - 1) % i == 0) {
                return i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PG_LV1_나머지가1이되는수찾기 method = new PG_LV1_나머지가1이되는수찾기();
        System.out.println(method.solution(10));
        System.out.println(method.solution(12));
    }
}
