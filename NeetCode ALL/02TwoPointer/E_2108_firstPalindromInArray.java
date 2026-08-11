class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            int left = 0;
            int right = word.length()-1;
            boolean found = true;
            while(left <= right){
                if(word.charAt(left) == word.charAt(right)){
                    left++;
                    right--;
                }else{
                    found = false;
                    break;
                }
            }
            if(found) return word;
        }
        return "";
    }
}