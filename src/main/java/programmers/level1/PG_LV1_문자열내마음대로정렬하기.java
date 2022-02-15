package programmers.level1;

import java.util.*;

public class PG_LV1_문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++){
            answer[i] = answer[i].substring(1);
        }
        return answer;
    }

    public static void main(String[] args) {
        PG_LV1_문자열내마음대로정렬하기 method = new PG_LV1_문자열내마음대로정렬하기();
        String[] arr = {"abce", "abcd", "cdx"};
        for (String i : method.solution(arr, 2)) {
            System.out.println(i);
        }
    }
}
