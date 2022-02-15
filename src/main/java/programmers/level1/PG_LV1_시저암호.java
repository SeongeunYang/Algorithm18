package programmers.level1;

public class PG_LV1_시저암호 {
    public String solution(String s, int n) {
        char[] ceaser = String.valueOf(s).toCharArray();
        String isUpLo;
        for (int i = 0; i < ceaser.length; i++) {
            if (ceaser[i] == ' ') {
                continue;
            }
            isUpLo = (ceaser[i] >= 'a')? "lower" : "upper";
            ceaser[i] = (char) (ceaser[i] + n);
            if (isUpLo=="lower" && ceaser[i] > 'z') { // 소문자 넘어갈 경우
                ceaser[i] = (char) (ceaser[i] - 26);
            } else if (isUpLo=="upper" && ceaser[i] > 'Z') { //대문자 넘어갈 경우
                ceaser[i] = (char) (ceaser[i] - 26);
            }
        }

        return String.valueOf(ceaser);
    }

    public static void main(String[] args) {
        PG_LV1_시저암호 method = new PG_LV1_시저암호();
        System.out.println(method.solution("y X Z", 10));
    }
}
