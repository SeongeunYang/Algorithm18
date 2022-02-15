package programmers.level1;

public class PG_LV1_정수제곱근판별 {
    public long solution(long n) {
        double sqrt_num = Math.sqrt(n);
        if (sqrt_num % 1 == 0) {
            return (long) Math.pow(sqrt_num + 1, 2);
        }
        return -1;
    }

    public static void main(String[] args) {
        PG_LV1_정수제곱근판별 method = new PG_LV1_정수제곱근판별();
        System.out.println(method.solution(121));
    }
}
