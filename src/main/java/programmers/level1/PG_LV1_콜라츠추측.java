package programmers.level1;

public class PG_LV1_콜라츠추측 {
    public int solution(int num) {
        long collatz = num; //범위오류..때문에 long형으로 선언
        for (int i = 0; i < 500; i++) {
            if(collatz == 1) {
                return  i;
            }
            collatz = (collatz % 2 == 0) ? collatz / 2 : collatz * 3 + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        PG_LV1_콜라츠추측 method = new PG_LV1_콜라츠추측();
        System.out.println(method.solution(626331));
    }
}
