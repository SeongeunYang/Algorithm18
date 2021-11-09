import java.util.*;

public class PlusInt {
    public int solution(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int answer=0;
        for(char ch : arr){
            answer += (ch-'0'); //아스키값 0을 빼주면 정수가 된다.
        }
        return answer;
    }

    public static void main(String[] args) {
        PlusInt method = new PlusInt();
        System.out.println(method.solution(987));
    }
}
