import java.util.ArrayList;

public class ternary {
    public int solution(int n) {
        ArrayList<Integer> nto = new ArrayList<>();
        while (n > 0) {
            nto.add(n % 3);
            n /= 3;
        }

        int answer = 0;
        int len = nto.toArray().length;
        for (int i = 0; i < len; i++) {
            answer += nto[len - 1 - i] * (Math.pow(3, i));
        }
        return answer;
    }

    public static void main(String[] args) {
        ternary method = new ternary();
    }
}
