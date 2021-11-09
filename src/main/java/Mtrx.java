public class Mtrx {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length]; //덧셈 결과를 담을 행렬 생성

        for (int i = 0; i < arr1.length; i++) { //행을 바꿔주는 for문
            for (int j = 0; j < arr1[0].length; j++) { //열을 바꿔주는 for문
                answer[i][j] = arr1[i][j] + arr2[i][j]; //각 위치 행렬 값 더하기
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Mtrx SumMtrx = new Mtrx();
        int[][] a = {{1, 2}, {2, 3}};
        int[][] b = {{3, 4}, {5, 6}};
        int[][] newMtrx = SumMtrx.solution(a, b);
    }
}
