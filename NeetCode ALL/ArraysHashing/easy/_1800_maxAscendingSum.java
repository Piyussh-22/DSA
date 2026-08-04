class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int answer = sum;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] < nums[i]){
                sum = sum + nums[i];
            }else{
                sum = nums[i];
            }
            answer = Math.max(sum,answer);
        }
        return answer;
    }
}