class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] answer = new int[2];
        int[] freq = new int[n*n];

        for(int[] arr : grid){
            for(int ele : arr){
                freq[ele-1]++;
                if(freq[ele-1] == 2){
                    answer[0] = ele;
                }
            }
        }

        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] == 0){
                answer[1] = i+1;
            }
        }
        return answer;
    }
}