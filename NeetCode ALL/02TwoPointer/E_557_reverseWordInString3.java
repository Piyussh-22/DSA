class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == ' ' || i == arr.length-1){
                int end = (arr[i] == ' ') ? i-1 : i ;
                while(start < end){
                    char temp = arr[end];
                    arr[end] = arr[start];
                    arr[start] = temp;
                    start++;
                    end--;
                }
                start = i + 1;
            }
        }
        return new String(arr);
    }
}