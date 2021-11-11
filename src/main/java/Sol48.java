import java.util.HashMap;
import java.util.Map;

public class Sol48 {
    public int[] solution(int N, int[] stages) {
        int[] count = new int[N + 1];// 스테이지 별 도전자 수를 담을 배열
        Map<Integer, Double> fail = new HashMap<>(); // <스테이지 : 실패율>을 담을 배열
        double challenger = stages.length; //실수 값 계산을 위해서 double형으로 선언
        int[] answer = new int[N]; //리턴할 배열

        // 현재 스테이지의 도전자 수 체크
        for (int i = 0; i < stages.length; i++) {
            count[stages[i] - 1]++;
        }
        for (int i = 0; i < N; i++) {
            if (count[i] == 0) {
                fail.put(i, 0.0); //실패율 0 넣어주기 -> 이부분 안해주면 실패! 값이 Nan으로 들어가기 때문! ArithmeticException
                continue;
            }
            fail.put(i, count[i] / challenger); // 현재스테이지 도전자 수  / 현재 스테이지에 도전한 총 도전자 수
            challenger -= count[i]; // 다음 스테이지의 총 도전자 수
        }

        for (int i = 0; i < N; i++) {// 시간 복잡도는... 등차수열 합 --> O(N^2)
            double maxPercent = -1; // 최소 퍼센트가 0.0이므로..
            int maxIndex = 0;

            for (int index : fail.keySet()) { // key만 가져오기
                if (maxPercent < fail.get(index)) {
                    maxPercent = fail.get(index);
                    maxIndex = index;
                }
            }

            answer[i] = maxIndex + 1; //스테이지는 배열인덱스 + 1..
            fail.remove(maxIndex); // 젤 큰 스테이지 정보를 삭제!!
        }

        return answer;
    }

    public static void main(String[] args) {
        Sol48 method = new Sol48();
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        for (int item : method.solution(5, stages)) {
            System.out.print(item + " ");
        }
    }
}
