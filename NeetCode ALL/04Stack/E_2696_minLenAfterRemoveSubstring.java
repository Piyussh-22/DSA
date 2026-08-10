class Solution {
    public int minLength(String s) {
       Stack<Character> stack = new Stack<>();
       for(char letter : s.toCharArray()){
        if(!stack.isEmpty() &&
         ((letter == 'B' && stack.peek() == 'A') ||
          (letter == 'D' && stack.peek() == 'C'))){
            stack.pop();
        }else{
            stack.push(letter);
        }
       }
       return stack.size();
    }
}