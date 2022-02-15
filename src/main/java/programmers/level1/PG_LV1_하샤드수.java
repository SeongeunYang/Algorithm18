package programmers.level1;

public class PG_LV1_하샤드수 {
    public boolean solution(int x) {
        String[] numArray = String.valueOf(x).split(""); //숫자 자릿수 다 분리하기
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += Integer.parseInt(numArray[i]); //각 자릿수 숫자 다 더하기
        }
        return x % sum == 0; //숫자/ 자릿수 다 더한 값이 되면 true, 아니면 false반환
    }

    public static void main(String[] args) {
        PG_LV1_하샤드수 method = new PG_LV1_하샤드수();
        System.out.println(method.solution(10));
        System.out.println(method.solution(12));
        System.out.println(method.solution(11));
        System.out.println(method.solution(13));
    }
}
