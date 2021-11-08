import java.util.HashSet;
import java.util.Set;

public class SumTwoNum {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }

        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        SumTwoNum method = new SumTwoNum();
        int[] arr = {5, 0, 2, 7};
        int[] result = method.solution(arr);
        for (Integer item : result)
            System.out.print(item + " ");
    }
}
