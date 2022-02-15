package programmers.level1;

public class PG_LV1_수박수박수박수박수박수 {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += (i%2 == 1)? "박":"수";
        }
        return answer;
    }

    public static void main(String[] args) {
        PG_LV1_수박수박수박수박수박수 method = new PG_LV1_수박수박수박수박수박수();
        System.out.println(method.solution(4));
    }
}
