package trenbi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase(); //모두 소문자로
        String[] sSplit = s.split("");

        // 중복 제거
        Set<String> sSet = new HashSet<String>(Arrays.asList(sSplit));
        long maxCnt = 0;
        for (String str : sSet) {
            long cnt = Arrays.stream(sSplit).filter(i -> i.contains(str)).count();
            if (cnt == maxCnt){
                answer += str;
            } else if (cnt > maxCnt){
                answer = str;
                maxCnt = cnt;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution1 method = new Solution1();
        System.out.println(method.solution("BbA"));
    }
}
