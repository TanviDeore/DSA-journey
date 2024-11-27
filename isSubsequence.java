class Solution {
    public boolean isSubsequence(String s, String t) {
    if(t.length()< s.length()) return false;
    if(s.length()==0) return true;
    int L = 0;
    int f = -1;
    for(int i = 0 ;i < s.length(); i++){
        f = -1; 
        while(L<t.length()){
            if(t.charAt(L)!=s.charAt(i)){
                L++;
            }
            else {
                f = 1;
                L++;
                break;
            }
        }
        if(f==-1) return false;
    }
    if(f!=-1) return true;
    else return false;
    }
}
