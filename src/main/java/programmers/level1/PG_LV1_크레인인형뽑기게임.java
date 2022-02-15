package programmers.level1;

import java.util.Stack;

public class PG_LV1_크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> dollBox = new Stack<>(); //뽑은 인형 담을 스택
        int removeDoll = 0; //사라진 인형의 개수

        for (int i : moves) {
            for (int j = 0; j < board.length; j++) {
                int doll = board[j][i - 1];
                if (doll != 0) { //인형이 존재할 때
                    board[j][i - 1] = 0;// 꺼낸 인형 없애주기
                    if (!dollBox.isEmpty() && dollBox.peek() == doll) {//만약 넣고자하는 인형이랑 젤 위에 있는 인형이랑 같으면 없애고
                        dollBox.pop();
                        removeDoll += 2; //없앤 인형 수 ++
                    } else {
                        dollBox.push(doll);
                    }
                    break; // 인형을 하나 뽑았으면 for문 종료
                }
            }
        }
        return removeDoll;
    }

    public static void main(String[] args) {
        PG_LV1_크레인인형뽑기게임 method = new PG_LV1_크레인인형뽑기게임();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(method.solution(board, moves));
    }
}
