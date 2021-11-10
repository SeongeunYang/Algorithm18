import java.util.Arrays;

public class idDivide {
    public int[] solution(int[] arr, int divisor) {
        // 나눠지는 것들만 새 배열에 저장하기
        int[] anwser = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
        if(anwser.length == 0){ //나눠지는 것이 없으면 -1 반환!
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