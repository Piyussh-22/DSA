class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int answer = 0;

        int child = 0;
        int cookie = 0;

        while(child <= g.length-1 && cookie <= s.length-1){
            if(g[child] <= s[cookie]){
                child++;
                answer++;
            }
            cookie++;
        }
        return answer;
    }
}