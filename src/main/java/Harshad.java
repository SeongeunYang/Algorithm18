import java.util.Arrays;

public class Harshad {
    public boolean solution(int x) {
        String[] numArray = String.valueOf(x).split("");
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += Integer.parseInt(numArray[i]);
        }
        return (x % sum == 0) ? true : false;
    }

    public static void main(String[] args) {
        Harshad method = new Harshad();
        System.out.println(method.solution(10));
        System.out.println(method.solution(12));
        System.out.println(method.solution(11));
        System.out.println(method.solution(13));
    }
}
