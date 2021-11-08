import java.util.Arrays;

public class SumNumber {
    public int solution(int[] numbers) {
        int sum = 45; // 0-9까지의 합
        return sum - Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        SumNumber method = new SumNumber();
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 0};
        int sum = method.solution(arr);
        System.out.println(sum);
    }
}
