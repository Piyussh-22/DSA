package ArraysHashing;
import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            if(freq.containsKey(c)){
                freq.put(c,freq.get(c)+1);
            }else{
                freq.put(c,1);
            }
        }

        //list contains pair. 
        // notes.
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : list){
            int loop = entry.getValue();
            for(int i = 0 ; i < loop ; i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}