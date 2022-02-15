package programmers.level1;

public class PG_LV1_숫자문자열과영단어 {
    public int solution(String s) {
        String[] num_str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < num_str.length; i++) {
            s = s.replace(num_str[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        PG_LV1_숫자문자열과영단어 method = new PG_LV1_숫자문자열과영단어();
        System.out.println(method.solution("one4seveneight"));
    }
}
