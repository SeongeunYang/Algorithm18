import java.util.HashSet;
import java.util.Set;

public class SumTwoNum {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>(); //HashSet은 중복을 허용하지 않음!

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]); // 순차적으로 더한값들을 추가, 중복되는 갑이 있다면 안넣어짐!
            }
        }

        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();// 정렬 후 int 배열로 형 변환해서 반환
    }

    public static void main(String[] args) {
        SumTwoNum method = new SumTwoNum();
        int[] arr = {5, 0, 2, 7};
        int[] result = method.solution(arr);
        for (Integer item : result)
            System.out.print(item + " ");
    }
}
