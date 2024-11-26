class Solution {
    public char[] swap(int i, int j, char[] c) {
        //char[] c = st.toCharArray();
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
        return c;
    }
   
    public String reverseVowels(String s) {
        int l = 0, r = s.length()-1;
        String str = "AEIOUaeiou";
        char[] c = s.toCharArray();
        while(l<r){
            while (l < r && !str.contains(String.valueOf(c[l]))) l++;
            while (l< r && !str.contains(String.valueOf(c[r]))) r--;
            if(l < r)
            {
             c = swap(l,r,c);
             l++;
             r--;
            } 
        }
        return new String(c);
    }
}
