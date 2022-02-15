package programmers.level1;

import java.util.Arrays;

public class PG_LV1_나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        // 나눠지는 것들만 새 배열에 저장하기
        int[] anwser = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
        if(anwser.length == 0){ //나눠지는 것이 없으면 -1 반환!
            anwser = new int[] {-1};
        }
        return anwser;
    }

    public static void main(String[] args) {
        PG_LV1_나누어떨어지는숫자배열 method = new PG_LV1_나누어떨어지는숫자배열();
        int[] arr = {3, 2, 6};
        for (int item : method.solution(arr, 10)) {
            System.out.print(item + " ");
        }
    }
}