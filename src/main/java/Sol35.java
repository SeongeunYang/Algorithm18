import java.util.*;

public class Sol35 {
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
        Sol35 method = new Sol35();
        String[] arr = {"abce", "abcd", "cdx"};
        for (String i : method.solution(arr, 2)) {
            System.out.println(i);
        }
    }
}
