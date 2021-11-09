import java.util.Arrays;
import java.util.Collections;

public class stringSort {
    public String solution(String s) {
        String[] answer = s.split(""); // String 분해
        Arrays.sort(answer, Collections.reverseOrder());// 내림차순 정렬

        return String.join("", answer); // 다시 합치기
    }

    public static void main(String[] args) {
        stringSort method = new stringSort();
        System.out.println(method.solution("Zbcdefg"));
    }
}
