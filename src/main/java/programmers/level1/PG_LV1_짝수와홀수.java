package programmers.level1;

public class PG_LV1_짝수와홀수 {
    public String Check(int num){
        return (num%2 == 0)? "Even" : "Odd"; //삼항 연산자 사용
    }

    public static void main(String[] args) {
        PG_LV1_짝수와홀수 PGLV1짝수와홀수_method = new PG_LV1_짝수와홀수();
        String result = PGLV1짝수와홀수_method.Check(4);
        System.out.println(result);
    }
}
