public class PG_스킬체크2_2 {
    public int answer = 0;
    public boolean[] visit;

    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
        return answer;
    }

    public void dfs(int[][] dungeons, int k, int level) {
        for(int i=0; i< dungeons.length; i++){
            if(!visit[i] && dungeons[i][0] <= k){
                visit[i] = true;
                dfs(dungeons, k - dungeons[i][1], level+1);
                visit[i] = false;
            }
        }

        answer = Math.max(answer, level);
    }

    public static void main(String[] args) {
        PG_스킬체크2_2 method = new PG_스킬체크2_2();
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        System.out.println(method.solution(80, dungeons));
    }
}
