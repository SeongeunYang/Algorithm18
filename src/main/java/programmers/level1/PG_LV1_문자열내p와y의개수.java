package programmers.level1;

public class PG_LV1_문자열내p와y의개수 {
    boolean solution(String s) {
        s = s.toLowerCase(); //대소문자를 합해서 카운트 하기 떄문에 다 소문자로 바꿔줌
        int count_p = (int) s.chars().filter(c -> c == 'p').count();//p 갯수 세기
        int count_y = (int) s.chars().filter(c -> c == 'y').count();//y 갯수 세기
        return count_p == count_y; //카운트가 같으면 1, 아니면 -1 반환
    }

    public static void main(String[] args) {
        PG_LV1_문자열내p와y의개수 method = new PG_LV1_문자열내p와y의개수();
        System.out.println(method.solution("Pyy"));
    }
}
