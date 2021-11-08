import java.util.Arrays;
import java.util.Collections;

public class stringSort {
    public String solution(String s) {
        String[] answer = s.split("");
        Arrays.sort(answer, Collections.reverseOrder());

        return String.join("", answer);
    }

    public static void main(String[] args) {
        stringSort method = new stringSort();
        System.out.println(method.solution("Zbcdefg"));
    }
}
