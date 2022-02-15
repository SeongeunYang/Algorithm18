package programmers;

public class PG_스킬체크2_1 {
    public int solution(int n) {
        int cntOne = Integer.bitCount(n);

        while (true) {
            int newOne = Integer.bitCount(++n);
            if (newOne == cntOne) {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        PG_스킬체크2_1 method = new PG_스킬체크2_1();
        System.out.println(method.solution(78));
        System.out.println(method.solution(15));
    }
}
