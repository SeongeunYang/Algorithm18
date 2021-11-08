//정수를 담고 있는 배열 arr의 평균값을 return하는 함수
import java.util.Arrays;

public class Average {
    public double cal_avg(int[] arr) {
        double average = Arrays.stream(arr).average().orElse(0);

        return average;
    }

    public static void main(String args[]){
        Average avg_method = new Average();
        int[] arr = {3,5};
        double avg = avg_method.cal_avg(arr);
        System.out.println(avg);
    }
}
