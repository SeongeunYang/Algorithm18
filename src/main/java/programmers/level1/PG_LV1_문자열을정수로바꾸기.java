package programmers.level1;

public class PG_LV1_문자열을정수로바꾸기 {
    public int changeToInt(String s){
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        PG_LV1_문자열을정수로바꾸기 method = new PG_LV1_문자열을정수로바꾸기();
        int result = method.changeToInt("1234");
        System.out.println(result);
    }
}