class Solution {
    public int strStr(String haystack, String needle) {
        int answer = -1;
        for(int i = 0 ; i <= (haystack.length() - needle.length()) ; i++){

            if(haystack.charAt(i) == needle.charAt(0)){

                int j = 0;
                while(j < needle.length()){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }
                    if(j == needle.length() - 1){
                        return i;
                    }
                    j++;
                }
            }
        }        
        return answer;
    }
}

// m2 return haystack.indexOf(needle);