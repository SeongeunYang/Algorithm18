package programmers.level1;

public class PG_LV1_3진법뒤집기 {
    public int solution(int n) {
        String nto = "";
        while (n > 0) {
            nto += (n % 3); //처음부터 거꾸로 담기!
            n /= 3;
        }

        return Integer.parseInt(nto,3);//3진수에 맞춰서 변환
    }

    public static void main(String[] args) {
        PG_LV1_3진법뒤집기 method = new PG_LV1_3진법뒤집기();
        System.out.println(method.solution(125));
    }
}
