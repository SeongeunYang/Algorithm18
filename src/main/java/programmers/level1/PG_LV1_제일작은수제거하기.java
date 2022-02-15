package programmers.level1;

import java.util.Arrays;

public class PG_LV1_제일작은수제거하기 {
    public int[] solution(int[] arr) {
        if(arr.length <= 1) {
            arr[0] = -1;
            return arr;
        }
        int min = Arrays.stream(arr).min().getAsInt(); // 최소값 얻기
        return Arrays.stream(arr).filter(i -> i != min).toArray();// 최소값을 제외하고 리턴
    }

    public static void main(String[] args) {
        PG_LV1_제일작은수제거하기 method = new PG_LV1_제일작은수제거하기();
        int[] arr = {4,3,2,1};
        for(int i : method.solution(arr)){
            System.out.print(i + " ");
        }
    }
}
