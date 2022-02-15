package programmers.level1;

import java.util.Arrays;

public class PG_LV1_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);//내림 차순 정렬
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) { // 만약 참가자랑 완주자가 다르다면 완주하지 못한 참가자!
                return  participant[i];
            }
        }

        return participant[i];
    }

    public static void main(String[] args) {
        PG_LV1_완주하지못한선수 method = new PG_LV1_완주하지못한선수();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        System.out.println(method.solution(participant, completion));
    }
}
