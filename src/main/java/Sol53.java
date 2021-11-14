import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sol53 {
    public int solution(String dartResult) {
        Pattern p = Pattern.compile("([0-9]+)([SDT])([*#]?)");
        Matcher m = p.matcher(dartResult);
        String whatBonus = "0SDT";
        ArrayList<Integer> result = new ArrayList<>();

        while (m.find()) {
            String oneCycle = m.group();
            int hitnum = oneCycle.charAt(0) - '0'; // 맞힌 점수, 아스키 변환해줘야함
            char Bonus = oneCycle.charAt(1); // 보너스 종류가 무엇인지
            int optionIndex = 2;
            int acha = 1;
            if (Bonus == '0') { //숫자가 10일 경우
                hitnum = 10;
                Bonus = oneCycle.charAt(2);
                optionIndex++;
            }
            if (optionIndex == oneCycle.length() - 1) { // 옵션이 존재한다면...
                if (oneCycle.charAt(optionIndex) == '*') {
                    acha = 2;
                    if (result.size() > 0) {
                        int update = result.get(result.size() - 1) * acha; //그 전의 값에 2곱하기..
                        result.set(result.size() - 1, update);
                    }
                } else {
                    acha = -1;
                }
            }

            result.add((int) Math.pow(hitnum, whatBonus.indexOf(Bonus)) * acha);
        }


        return result.stream().mapToInt(Integer::intValue).sum(); //길이가 무조건 3으로 고정적이므로 stream사용!
    }

    public static void main(String[] args) {
        Sol53 method = new Sol53();
        System.out.println(method.solution("1S2D*3T"));
    }
}
