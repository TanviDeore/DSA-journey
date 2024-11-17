class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        char[] b = t.toCharArray();
        Arrays.sort(b);
        if(a.length!=b.length) return false;
        s  = new String(a);
        t = new String(b);
        return s.equals(t);
    }
}
