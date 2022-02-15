package programmers.level1;

public class PG_LV1_최소직사각형 {
    public int solution(int[][] sizes) {
        int tmp;
        int max_width = 0, max_height = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                //sizes[i][0]에 명함의 긴부분을 저장하기!!!
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if (sizes[i][0] > max_width) { //가로길이가 젤 긴 것 찾기
                max_width = sizes[i][0];
            }
            if (sizes[i][1] > max_height) { //세로길이가 젤 긴 것 찾기
                max_height = sizes[i][1];
            }
        }
        return max_height * max_width; //최댓값끼리 곱해서 반환!
    }

    public static void main(String[] args) {
        PG_LV1_최소직사각형 method = new PG_LV1_최소직사각형();
        int[][] cards = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(method.solution(cards));
    }
}

//other solution -> 보기엔 깔끔하지만 시간은 라이브러리 사용으로 인해 조금 더 오래걸림!!
//public int solution(int[][] sizes) {
//    int length = 0, height = 0;
//    for (int[] card : sizes) {
//        length = Math.max(length, Math.max(card[0], card[1]));
//        height = Math.max(height, Math.min(card[0], card[1]));
//    }
//    int answer = length * height;
//    return answer;
//}
