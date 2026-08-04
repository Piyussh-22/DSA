class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new LinkedHashMap<>();
        for(String s : arr){
            map.put(s , map.getOrDefault(s,0)+1 );
        }
        int idx = 1;
        for(Map.Entry<String,Integer> pair : map.entrySet()){
            if(pair.getValue() == 1){
                if(idx == k){
                    return pair.getKey();
                }
                idx++;
            }
        }
        return "";
    }
}