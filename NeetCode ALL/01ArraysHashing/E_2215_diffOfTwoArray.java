import java.util.*;
// m1 

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> unique1 = new HashSet<>();
        for(int k : nums1){
            unique1.add(k);
        }

        Set<Integer> unique2 = new HashSet<>();
        for(int k : nums2){
            unique2.add(k);
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        
        for(int k : unique1){
            if(!unique2.contains(k)){
                answer.get(0).add(k);
            }
        }

        for(int k : unique2){
            if(!unique1.contains(k)){
                answer.get(1).add(k);
            }
        }

        return answer;
    }
}

/* m2

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> unique1 = new HashSet<>();
        Set<Integer> unique2 = new HashSet<>();

        for(int k : nums1) unique1.add(k);
        for(int k : nums2) unique2.add(k);


        Set<Integer> copy1 = new HashSet<>(unique1);
        Set<Integer> copy2 = new HashSet<>(unique2);

        unique1.removeAll(copy2);
        unique2.removeAll(copy1);

        return Arrays.asList(
            new ArrayList<>(unique1),new ArrayList<>(unique2)
        );
    }
}
    */