package programmers;

public class PG_신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

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
