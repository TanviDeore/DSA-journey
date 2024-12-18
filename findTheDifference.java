class Solution {
    public static int[] countchars(String st,int[] count){
        for(int i = 0; i < st.length();i++){
            int index = st.charAt(i) - 'a';
            count[index]++;
        }
        return count;
    }
    public char findTheDifference(String s, String t) {
        int[] s1 = new int[26];
        int[] t1 = new int[26];
        s1 = countchars(s,s1);
        t1 = countchars(t,t1);

        for(int i = 0; i < 26; i++){
            if(s1[i]!=t1[i]){
                return (char)(i+'a');
            }
        }

        return 'a';
    }
}
