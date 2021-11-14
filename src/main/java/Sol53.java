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
            int hitnum = Integer.parseInt(m.group(1)); // 맞힌 점수, 아스키 변환해줘야함
            char Bonus = m.group(2).charAt(0); // 보너스 종류가 무엇인지
            String option = m.group(2);
            int optionNum = 1;
            if (!option.equals("")) { // 옵션이 존재한다면...
                if (option.equals("*")) { // * : 스타상
                    if (result.size() > 0) {
                        optionNum = 2;
                        int update = result.get(result.size() - 1) * optionNum; //그 전의 값에 2곱하기..
                        result.set(result.size() - 1, update); //그 전 값 없데이트!
                    }
                } else {
                    optionNum = -1; // # : 아차상
                }
            }
            result.add((int) Math.pow(hitnum, whatBonus.indexOf(Bonus)) * optionNum);
        }

        return result.stream().mapToInt(Integer::intValue).sum(); //길이가 무조건 3으로 고정적이므로 stream사용!
    }

    public static void main(String[] args) {
        Sol53 method = new Sol53();
        System.out.println(method.solution("1D2S3T*"));
    }
}