import java.util.Arrays;

public class delMinNum {
    public int[] solution(int[] arr) {
        if(arr.length <= 1) {
            arr[0] = -1;
            return arr;
        }
        int min = Arrays.stream(arr).min().getAsInt(); // 최소값 얻기
        return Arrays.stream(arr).filter(i -> i != min).toArray();// 최소값을 제외하고 리턴
    }

    public static void main(String[] args) {
        delMinNum method = new delMinNum();
        int[] arr = {4,3,2,1};
        for(int i : method.solution(arr)){
            System.out.print(i + " ");
        }
    }
}
