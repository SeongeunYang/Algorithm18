import java.util.Arrays;

public class Sol33 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int count = 0;
        int miss = 0;

        for (int i = 0; i < lottos.length; i++) {
            //번호가 0이면 지워진 번호이므로 miss에 다음 인덱스로 넘어가기
            if (lottos[i] == 0) {
                miss++;
                continue;
            }

            for (int j = 0; j < win_nums.length; j++) {
                 if (lottos[i] == win_nums[j]) { //찾았으니 break;
                    count++;
                    break;
                }
            }
        }

        int[] answer = {rank[count + miss], rank[count]};
        return answer;
    }

    public static void main(String[] args) {
        Sol33 method = new Sol33();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        for (int i : method.solution(lottos, win_nums)) {
            System.out.print(i + " ");
        }
    }
}