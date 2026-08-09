class Solution {
    public int minimumDifference(int[] nums, int k) {
        int answer = Integer.MAX_VALUE;
        int left = 0;
        int right = k-1;
        Arrays.sort(nums);
        while(right < nums.length){
            int diff = nums[right] - nums[left];
            answer = Math.min(diff,answer);
            right++;
            left++;
        }
        return answer;
    }
}