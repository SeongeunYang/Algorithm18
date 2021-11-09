import java.util.Arrays;

public class SumNumber {
    public int solution(int[] numbers) {
        int sum = 45; // 0-9까지의 합
        return sum - Arrays.stream(numbers).sum(); //전체 합에서 배열의 합을 빼면, 없는 숫자의 합이 된다!
    }

    public static void main(String[] args) {
        SumNumber method = new SumNumber();
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 0};
        int sum = method.solution(arr);
        System.out.println(sum);
    }
}