class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(char c : text.toCharArray()){
            freq[c-'a']++;
        }

        int ones = Math.min(freq['b'-'a'] , Math.min(freq['a'-'a'] , freq['n'-'a']));
        int twice = Math.min(freq['l'-'a'], freq['o'-'a']) / 2 ;

        return Math.min(twice,ones);
    }
}