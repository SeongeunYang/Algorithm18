public class clapping {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += (i%2 == 1)? "박":"수";
        }
        return answer;
    }

    public static void main(String[] args) {
        clapping method = new clapping();
        System.out.println(method.solution(4));
    }
}
