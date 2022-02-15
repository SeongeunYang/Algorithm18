package programmers.level1;

public class PG_LV1_신규아이디추천 {
    public String solution(String new_id) {
        //Step 1
        new_id = new_id.toLowerCase();

        //Step 2
        new_id = new_id.replaceAll("[^\\w\\-_.]*", "");

        //Step 3
        new_id = new_id.replaceAll("[.]{2,}", ".");

        //Step 4
        new_id = new_id.replaceAll("^[.]|[.]$", "");

        //Step 5
        if(new_id.equals("")){
            new_id = "a";
        }

        //Step 6
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
        }
        new_id = new_id.replaceAll("[.]$", "");

        //Step 7
        int len = new_id.length();
        if (len < 3) {
            for (int i = len; i < 3; i++) {
                new_id += new_id.charAt(len-1);
            }
        }

        return new_id;
    }

    public static void main(String[] args) {
        PG_LV1_신규아이디추천 method = new PG_LV1_신규아이디추천();
        System.out.println(method.solution("=.="));
    }
}
