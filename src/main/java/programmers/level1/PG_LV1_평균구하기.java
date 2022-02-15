package programmers.level1;

import java.util.Arrays;

public class PG_LV1_평균구하기 {
    public double cal_avg(int[] arr) {
        //Arrays.stream을 이용해 평균을 구하고 평균은 못구한다면 0을 리턴
        double average = Arrays.stream(arr).average().orElse(0);

        return average;
    }

    public static void main(String args[]){
        PG_LV1_평균구하기 avg_method = new PG_LV1_평균구하기();
        int[] arr = {3,5};
        double avg = avg_method.cal_avg(arr);
        System.out.println(avg);
    }
}