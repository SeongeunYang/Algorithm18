import java.util.regex.Pattern;

public class stringCheck {
    public boolean solution(String s) {
        return Pattern.matches("[\\d]{4}|[\\d]{6}",s);
    }

    public static void main(String[] args) {
        stringCheck method =  new stringCheck();
        System.out.println(method.solution("1234"));
    }
}
