package programmers.level1;

public class PG_LV1_두정수사이의합 {
    public long solution(int a, int b) {
        long sum = 0;
        //Math 라이브러리를 이용해서 작은 수부터 시작해서 큰 수까지 더하기
        for(int i=Math.min(a,b); i<=Math.max(a,b); i++)
            sum += i;

        return sum;
    }

    public static void main(String[] args) {
        PG_LV1_두정수사이의합 sum_method = new PG_LV1_두정수사이의합();
        long sum = sum_method.solution(3, 5);
        System.out.println(sum);
    }
}