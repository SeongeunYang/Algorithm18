public class Sol44 {
    public int[] solution(int n, int m) {
        int[] answer = {n, m};
        int max = n, min = m;
        int remainder;
        if (n == m) {
            return answer;
        } else if (m > n) {
            max = m;
            min = n;
        }

        while (min != 0) { //나머지가 있으면
            remainder = max % min; // 큰수에서 작은 수를 나눈 나머지
            max = min; //나눠질 수를 설정
            min = remainder; //나눌 수를 설정
        }
        answer[0] = max; //최대공약수
        answer[1] = max * (n / max) * (m / max); //최대공약수로 나눈 몫끼리 곱 * 최대공약수 하면 최소공배수!!

        return answer;
    }

    public static void main(String[] args) {
        Sol44 method = new Sol44();
        for (int i : method.solution(3, 12)) {
            System.out.print(i + " ");
        }
    }
}

//최대공약수 원래 계산식의 단점
// 수가 크면 계산이 복잡하다 -> 2와 3으로 계속나누다가.. 나눈만큼 다 곱해줘서 구하기--> 연산이 너무 많다
// 약수 찾기가 어렵다

// 유클리드 호제법
// 큰수를 작은수로 나눈다
// 작은 수를 나눈 나머지로 계속 나눈다 -> 나머지가 0이 나오면 나누는 수가 최대공약수!!
