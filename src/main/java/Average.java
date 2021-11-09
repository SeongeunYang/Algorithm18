import java.util.Arrays;

public class Average {
    public double cal_avg(int[] arr) {
        //Arrays.stream을 이용해 평균을 구하고 평균은 못구한다면 0을 리턴
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