import java.util.Arrays;

public class test1 {
    public int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                int sign = (signs[i][j]) ? 1 : -1;
                answer[i][j] = arr1[i][j] * sign + arr2[i][j] * sign;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        test1 method = new test1();
        int[][] arr1 = {{5, 7, 1}, {2, 3, 5}};
        int[][] arr2 = {{5, 1, 6}, {7, 5, 6}};
        boolean[][] signs = {{true, true, false}, {false, true, false}};
        System.out.println(Arrays.deepToString(method.solution(arr1, arr2, signs)));
    }
}
