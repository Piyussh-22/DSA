class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;

        // not used int[] because it is compared by reference.
        Set<List<Integer>> set = new HashSet<>();
        set.add(List.of(x,y));

        for(char c : path.toCharArray()){
            if(c == 'N') y++;
            else if(c == 'S') y--;
            else if(c == 'E') x++;
            else x--;

            if(!set.add(List.of(x,y))) return true;
        }
        return false;
    }
}