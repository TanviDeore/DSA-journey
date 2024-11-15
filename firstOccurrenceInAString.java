class Solution {
    public int strStr(String haystack, String needle) {
        int lengthNeedle = needle.length();
        int haystackLength = haystack.length();
        if(lengthNeedle>haystackLength){
            return -1;
        }
        if(!haystack.contains(needle)){
            return -1;
        }
        for(int i = 0;i<haystackLength;i++){
            if(haystack.substring(i,(i+lengthNeedle)).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
