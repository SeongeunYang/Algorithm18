package programmers.level1;

public class PG_LV1_이상한문자만들기 {
    public String solution(String s) {
        String[] str_list = s.split("");
        int cnt = 0 ;

        for (int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals(" ")){
                cnt=0;
            } else{
                str_list[i] = (cnt % 2 == 0) ? str_list[i].toUpperCase() : str_list[i].toLowerCase();
                cnt++;
            }
        }

        return String.join("", str_list);
    }

    public static void main(String[] args) {
        PG_LV1_이상한문자만들기 method = new PG_LV1_이상한문자만들기();
        System.out.println(method.solution("Ab Ab Ab Ab"));
    }
}
