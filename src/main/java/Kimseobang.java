public class Kimseobang {
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
        Kimseobang method = new Kimseobang();

        String[] arr = {"Jane", "Kim"};
        System.out.println(method.solution(arr));
    }
}