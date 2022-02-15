package programmers.level1;

public class PG_LV1_핸드폰번호가리기 {
    public String solution(String phone_number) {
        int len = phone_number.length();//핸드폰 번호 길이
        // * 뒤 4자리를 제외한 길이만큼의배열 생성 + 뒷번호 4자리
        return new String(new char[len - 4]).replace("\0", "*") + phone_number.substring(len - 4, len);
    }

    public static void main(String[] args) {
        PG_LV1_핸드폰번호가리기 method = new PG_LV1_핸드폰번호가리기();
        String result = method.solution("01044172716");
        System.out.println(result);
    }
}
