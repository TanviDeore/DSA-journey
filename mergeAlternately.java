class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int l = Math.min(word1.length(),word2.length());
        for(int i=0;i<l;i++){
            ans = ans+word1.charAt(i)+word2.charAt(i);
        }
        if(word1.length()!=l){
            ans = ans + word1.substring(l);
            return ans;
        }
        ans = ans + word2.substring(l);
        return ans;
    }
}
