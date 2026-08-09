class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        
        for(int num : arr){
            freq.put(num , freq.getOrDefault(num,0) + 1 ) ;
        }

        int lucky = -1;
        //For a HashMap<Integer, Integer>, getKey() and getValue() both return an Integer primitive wrapper object. 

        for(Map.Entry<Integer,Integer> pair : freq.entrySet()){
            if(pair.getValue().equals(pair.getKey())){
                lucky = Math.max(lucky, pair.getKey());
            }
        }

        return lucky;
    }
}