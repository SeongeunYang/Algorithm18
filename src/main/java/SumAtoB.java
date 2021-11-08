//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수
public class SumAtoB {
    public long solution(int a, int b) {
        long sum = 0;
        for(int i=Math.min(a,b); i<=Math.max(a,b); i++)
            sum += i;

        return sum;
    }

    public static void main(String[] args) {
        SumAtoB sum_method = new SumAtoB();
        long sum = sum_method.solution(3, 5);
        System.out.println(sum);
    }
}
