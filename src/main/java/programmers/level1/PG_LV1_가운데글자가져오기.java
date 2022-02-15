package programmers.level1;

public class PG_LV1_가운데글자가져오기 {
    public String centerString(String s) {
        int index = s.length() / 2; //중앙 인덱스 찾기

        //짝수라면 중앙 2글자 출력, 홀수라면 중앙 1글자 출력력
       return (s.length() % 2 == 0) ? s.substring(index-1, index + 1) : s.substring(index, index+1);
    }

    public static void main(String[] args) {
        PG_LV1_가운데글자가져오기 method = new PG_LV1_가운데글자가져오기();
        String result = method.centerString("abcdef");
        System.out.println(result);
    }
}