package programmers.level1;

public class PG_LV1_자릿수더하기 {
    public int solution(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int answer=0;
        for(char ch : arr){
            answer += (ch-'0'); //아스키값 0을 빼주면 정수가 된다.
        }
        return answer;
    }

    public static void main(String[] args) {
        PG_LV1_자릿수더하기 method = new PG_LV1_자릿수더하기();
        System.out.println(method.solution(987));
    }
}
