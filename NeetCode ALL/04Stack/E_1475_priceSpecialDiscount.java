class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<int[]> stack = new Stack<>();
        for(int i = 0 ; i < prices.length ; i++){
            int[] arr = {i,prices[i]};
            while(!stack.isEmpty() && stack.peek()[1] >= prices[i]){
                int[] temp = stack.pop();
                answer[temp[0]] = temp[1] - prices[i];
            }
            stack.push(arr);
        }
        while(!stack.isEmpty()){
            int[] temp = stack.pop();
            answer[temp[0]] = temp[1];
        }
        return answer;
    }
}