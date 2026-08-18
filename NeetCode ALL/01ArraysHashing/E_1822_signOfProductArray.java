class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int k : nums){
            if(k == 0) return 0;
            if(k < 0) sign = sign * (-1);
        }
        return sign;
    }
}