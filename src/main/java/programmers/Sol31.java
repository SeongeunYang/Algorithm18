package programmers;

import java.util.ArrayList;

public class Sol31 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        int pre = -1;
        for (int cur : arr) {
            if (pre != cur) {
                arr1.add(cur);
                pre = cur;
            }
        }
        return arr1.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Sol31 method = new Sol31();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        for (int i : method.solution(arr)) {
            System.out.print(i);
        }
    }
}
