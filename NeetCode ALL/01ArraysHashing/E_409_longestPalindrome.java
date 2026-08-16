class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[52];
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                arr[c-'a']++;
            }else{
                arr[26 + c-'A']++;
            }
        }
        boolean hasOdd = false;
        int length = 0;
        for(int k : arr){
            length = length + (k/2)*2 ;
            if(k % 2 == 1){
                hasOdd = true;
            }
        }
        if(hasOdd) length++;
        return length;
    }
}