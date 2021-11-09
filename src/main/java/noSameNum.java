import java.util.*;

public class noSameNum {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        int preNum = 0;
        for(int num : arr) {
            if(preNum != num){
                arr1.add(num);
            }
            preNum = num;
        }
        return arr1.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        noSameNum method = new noSameNum();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        for (int i : method.solution(arr)) {
            System.out.println(i);
        }
    }
}
