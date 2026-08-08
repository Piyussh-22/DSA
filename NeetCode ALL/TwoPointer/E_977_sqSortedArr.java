class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i]*nums[i];
        }
        int len = nums.length;
        int[] arr = new int[len];

        int left = 0;
        int right = len-1;
        for(int i = len-1 ; i >= 0 ; i--){
            if(nums[right] > nums[left]){
                arr[i] = nums[right];
                right--;
            }else{
                arr[i] = nums[left];
                left++;
            }
        }
        return arr;
    }
}