import java.util.ArrayList;
import java.util.List;

public class PG_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> results = new ArrayList<>();
        int idx = 0;
        while (idx != progresses.length) {
            int finishied = 0;
            double days = Math.ceil((double) (100 - progresses[idx]) / speeds[idx]);
            finishied++;
            for (int i = idx + 1; i < progresses.length; i++) {
                if (progresses[i] + days * speeds[i] >= 100) {
                    finishied++;
                } else {
                    break; // 뒤의 기능은 앞보다 먼저 처리될 수 없기 때문에 바로 나오기..
                }
            }
            results.add(finishied);
            idx += finishied;
        }

        int[] answer = results.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        PG_기능개발 method = new PG_기능개발();
        int[] results = method.solution(progresses, speeds);
        for (int result : results) {
            System.out.println(result);
        }
    }
}
