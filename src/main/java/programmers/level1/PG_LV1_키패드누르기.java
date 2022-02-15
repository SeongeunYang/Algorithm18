package programmers.level1;

public class PG_LV1_키패드누르기 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] rightHand = {3, 2};
        int[] leftHand = {3, 0};
        int[][] keypad = {{3, 1, 0},
                {0, 0, -1}, {0, 1, 0}, {0, 2, 1},
                {1, 0, -1}, {1, 1, 0}, {1, 2, 1},
                {2, 0, -1}, {2, 1, 0}, {2, 2, 1}};

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (keypad[num][2] == -1) { // 왼손 이동
                leftHand = keypad[num];
                answer += "L";
            } else if (keypad[num][2] == 1) { // 오른손 이동
                rightHand = keypad[num];
                answer += "R";
            } else { //중앙에 있는 키패드를 칠 때!!
                int distanceL, distanceR;
                distanceL = Math.abs(keypad[num][0] - leftHand[0]) + Math.abs(keypad[num][1] - leftHand[1]);
                distanceR = Math.abs(keypad[num][0] - rightHand[0]) + Math.abs(keypad[num][1] - rightHand[1]);

                if (distanceL == distanceR) { // 거리가 같을때
                    if (hand.equals("right")) { // equals사용주의
                        rightHand = keypad[num];
                        answer += "R";
                    } else {
                        leftHand = keypad[num];
                        answer += "L";
                    }
                } else if (distanceL < distanceR) { //왼쪽이 더 가까울 때
                    leftHand = keypad[num];
                    answer += "L";
                } else {
                    rightHand = keypad[num];
                    answer += "R";
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PG_LV1_키패드누르기 method = new PG_LV1_키패드누르기();
        int[] nums = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        System.out.println(method.solution(nums, "right"));
    }
}
