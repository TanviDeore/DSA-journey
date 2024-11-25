class Solution {
    public int firstUniqChar(String s) {
        int[] c = new int[26];
        int j = s.length();
        for(int i = 0 ;i<s.length();i++){
            int index = s.charAt(i) - 'a';
            c[index]++;
        }
        for(int i = 0;i<26;i++){
            if(c[i]==1){
                int k = s.indexOf((char)(i+'a'));
                if(k < j) j = k;
                
            }
        }
        if(j!=s.length()) return j;
        return -1;
    }
}
