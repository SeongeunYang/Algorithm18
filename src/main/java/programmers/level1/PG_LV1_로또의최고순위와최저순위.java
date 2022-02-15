package programmers.level1;

public class PG_LV1_로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int count = 0, miss = 0;

        for (int i : lottos) {
            if (i == 0) { //지워진 번호이므로 continue로 비교과정 생략
                miss++;
                continue;
            }

            for (int j : win_nums) {
                if (i == j) { //찾았으니 break;
                    count++;
                    break;
                }
            }
        }

        int[] answer = {rank[count + miss], rank[count]};
        return answer;
    }

    public static void main(String[] args) {
        PG_LV1_로또의최고순위와최저순위 method = new PG_LV1_로또의최고순위와최저순위();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        for (int i : method.solution(lottos, win_nums)) {
            System.out.print(i + " ");
        }
    }
}