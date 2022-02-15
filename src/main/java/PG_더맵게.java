import java.util.PriorityQueue;

public class PG_더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int sco : scoville) {
            priorityQueue.add(sco);
        }

        while (priorityQueue.peek() <= K) {
            try {
                int notSpicy1 = priorityQueue.poll();
                int notSpicy2 = priorityQueue.poll();

                int newScoville = notSpicy1 + (2 * notSpicy2);
                priorityQueue.add(newScoville);
                answer++;
            }catch (Exception e){
                return -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PG_더맵게 method = new PG_더맵게();
        int[] scoville = {1, 2};
        System.out.println(method.solution(scoville, 7));
    }
}
