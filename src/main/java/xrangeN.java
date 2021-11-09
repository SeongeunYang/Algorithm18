import java.util.Arrays;

public class xrangeN {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1); //등차수열과 같다. an =  a + n*d
        }
        return answer;
    }

    public static void main(String[] args) {
        xrangeN method = new xrangeN();
        long[] result = method.solution(2, 5);
        System.out.println(Arrays.toString(result));
    }
}
