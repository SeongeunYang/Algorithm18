public class WhatDay {
    public String solution(int a, int b) {
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};//요일 선언
        int[] monthDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //각 달이 총 며칠인지

        int totalDay = 0;
        for (int i = 0; i < a; i++) { //1월부터 입력한 달까지의 일수를 모두 더하기
            totalDay += monthDays[i];
        }
        totalDay += b; //현재 일수 더하기

        //1월 1일이 금요일이니 (목요일부터 시작해서 + 총 요일수)%7을 하면 입력한 날의 요일이 나옴!
        return day[(4 + totalDay) % 7];
    }

    public static void main(String[] args) {
        WhatDay method = new WhatDay();
        System.out.println(method.solution(5, 24));
    }
}
