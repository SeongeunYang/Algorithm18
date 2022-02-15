package programmers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PG_11111 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a*b");
        String INPUT = "abccc-abccc-abccc";

        Matcher matcher = pattern.matcher(INPUT); //Matcher 객체 생성
        StringBuffer buffer = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(buffer, "!");
        }
        matcher.appendTail(buffer);
        System.out.println(buffer);
    }
}