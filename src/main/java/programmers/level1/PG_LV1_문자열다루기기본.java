package programmers.level1;

import java.util.regex.Pattern;

public class PG_LV1_문자열다루기기본 {
    public boolean solution(String s) {
        return Pattern.matches("[\\d]{4}|[\\d]{6}",s);
    }

    public static void main(String[] args) {
        PG_LV1_문자열다루기기본 method =  new PG_LV1_문자열다루기기본();
        System.out.println(method.solution("1234"));
    }
}
