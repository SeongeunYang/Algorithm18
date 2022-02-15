package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class PG_LV1_문자열내림차순으로배치하기 {
    public String solution(String s) {
        String[] answer = s.split(""); // String 분해
        Arrays.sort(answer, Collections.reverseOrder());// 내림차순 정렬

        return String.join("", answer); // 다시 합치기
    }

    public static void main(String[] args) {
        PG_LV1_문자열내림차순으로배치하기 method = new PG_LV1_문자열내림차순으로배치하기();
        System.out.println(method.solution("Zbcdefg"));
    }
}
