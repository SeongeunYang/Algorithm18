package programmers.level1;

public class PG_LV1_서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer= "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){ // Kim과 일치하는 문자열을 찾아야 한다.!
                answer =  "김서방은 " + i+"에 있다";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PG_LV1_서울에서김서방찾기 method = new PG_LV1_서울에서김서방찾기();

        String[] arr = {"Jane", "Kim"};
        System.out.println(method.solution(arr));
    }
}