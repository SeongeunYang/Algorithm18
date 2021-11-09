import java.util.Arrays;

public class idDivide {
    public int[] solution(int[] arr, int divisor) {
        int[] anwser = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
        if(anwser.length == 0){
            anwser = new int[] {-1};
        }
        return anwser;
    }

    public static void main(String[] args) {
        idDivide method = new idDivide();
        int[] arr = {3, 2, 6};
        for (int item : method.solution(arr, 10)) {
            System.out.print(item + " ");
        }
    }
}