package programmers.level1;

import java.util.stream.Stream;

public class PG_LV1_자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] arr = Stream.of(ss).mapToInt(Integer::parseInt).toArray();

        return arr;
    }

    public static void main(String[] args) {
        PG_LV1_자연수뒤집어배열로만들기 method = new PG_LV1_자연수뒤집어배열로만들기();
        for (int i : method.solution(12345)) {
            System.out.print(i + " ");
        }
    }
}
