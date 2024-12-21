class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h =  new HashSet<>();
        if(s.length()==1) return 1;
        if(s.length() == 0) return 0;
        int max = 0;
        int L=0;
        int R=0;
        while(R < s.length()){
            if(!h.contains(s.charAt(R))){
                h.add(s.charAt(R));
                R++;
                max = Math.max(max,h.size());
            }
            else{
                //System.out.println(R);
                h.remove(s.charAt(L));
                L++;
            }
        }
        return max;
    }
}
