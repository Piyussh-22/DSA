//m1
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean asc = true;
        boolean dec = true;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] < nums[i+1]){
                dec = false;
            }
            if(nums[i] > nums[i+1]){
                asc = false;
            }
        }
        return asc || dec;
    }
}

//m2
class Solution2 {
    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 2) return true;
        //find curve 
        boolean up = true;
        int point = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                if(i == nums.length-2) return true;
                continue;
            }else if(nums[i] < nums[i+1]){
                up = true;
                point = i;
                break;
            }else{
                up = false;
                point = i;
                break;
            }
        }
        for(int j = point ; j < nums.length-1 ; j++){
            if(up){
                if(nums[j] > nums[j+1]){
                    return false;
                }
            }else{
                if(nums[j] < nums[j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}