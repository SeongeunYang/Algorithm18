package programmers.level1;

import java.util.Arrays;

public class PG_LV1_없는숫자더하기 {
    public int solution(int[] numbers) {
        int sum = 45; // 0-9까지의 합
        return sum - Arrays.stream(numbers).sum(); //전체 합에서 배열의 합을 빼면, 없는 숫자의 합이 된다!
    }

    public static void main(String[] args) {
        PG_LV1_없는숫자더하기 method = new PG_LV1_없는숫자더하기();
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 0};
        int sum = method.solution(arr);
        System.out.println(sum);
    }
}