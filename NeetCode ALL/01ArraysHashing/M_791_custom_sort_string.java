package ArraysHashing;
class Solution {
    public String customSortString(String order, String s) {
        // count freq of all char of s.
        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : order.toCharArray()){
            if(arr[c-'a'] != 0){
                for(int i = 0 ; i < arr[c-'a'] ; i++){
                    sb.append(c);
                }
                arr[c-'a'] = 0;
            }
        }

        for(int i = 0 ; i <= 25 ; i++){
            if(arr[i] != 0){
                for(int j = 0 ; j < arr[i] ; j++){
                    sb.append( (char) (i +'a'));
                }
            }
        }
        return sb.toString();
    }
}