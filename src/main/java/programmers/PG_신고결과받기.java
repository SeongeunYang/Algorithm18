package programmers;

import java.util.*;

public class PG_신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // 중복 제거 ( 같은 사람이 같은 사람을 신고했을 때 )
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));
        HashMap<String, Integer> alertCnt = new HashMap<>();
        HashMap<String, List> reportUser = new HashMap<>();

        // user들 HashMap 생성
        for (String user : id_list) {
            alertCnt.put(user, 0);
            reportUser.put(user, new ArrayList());
        }

        // key: 신고당한유저 value: 신고한 유저들 리스트
        for (String set : reportSet) {
            String[] data = set.split(" ");
            List<String> userList = reportUser.get(data[1]);
            userList.add(data[0]);
        }

        for (String user : id_list) {
            List<String> userList = reportUser.get(user);
            if (userList.size() >= k) {
                for (String alert : userList) {
                    int cnt = alertCnt.get(alert);
                    cnt++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PG_신고결과받기 method = new PG_신고결과받기();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int[] results = method.solution(id_list, report, 2);
        for (int i : results) {
            System.out.println(i);
        }
    }
}
