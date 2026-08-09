class Solution {
    public int arrangeCoins(int n) {
        if(n == 1) return 1;
        int completed = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n >= i){
                completed++;
            }else{
                break;
            }
            n -= i;
        }
        return completed;
    }
}