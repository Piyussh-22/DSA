class Solution {
    public String longestCommonPrefix(String[] strs) {
        String cheak = strs[0];
        for(int i = 1 ; i < strs.length ; i++){
            while(!strs[i].startsWith(cheak)){
                cheak = cheak.substring(0,cheak.length()-1);
                    if(cheak.isEmpty()){
                        return "";
                    }
            }
        }
        return cheak;
    }
}