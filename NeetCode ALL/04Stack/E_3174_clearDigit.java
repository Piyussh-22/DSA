class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.isEmpty() || Character.isLetter(c) || Character.isDigit(stack.peek())){
                stack.push(c);
            }else{
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
}