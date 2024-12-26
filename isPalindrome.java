class Solution {
    public boolean isPalindrome(String s) {
      s = s.toLowerCase();
      int L = 0;
      int R = s.length()-1;
      while(L<R){
        while(L< s.length() && R>0 && !String.valueOf(s.charAt(L)).matches("[a-z0-9]")){
            L++;
        }
        while(L< s.length() && R>0 && !String.valueOf(s.charAt(R)).matches("[a-z0-9]")){
            R--;
        }
        if(L< s.length() && R>0 && s.charAt(L)!=s.charAt(R)){
            return false;
        }
        L++;
        R--;
      } 
      return true; 
    }
}
