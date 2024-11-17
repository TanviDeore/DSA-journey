class Solution {
    public boolean checkIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        else{
            HashMap<Character,Character> map =  new HashMap<>();
            char a[] = s.toCharArray();
            char b[] = t.toCharArray();
            for(int i=0;i<s.length();i++){
                if(!map.containsKey(a[i])){
                        map.put(a[i],b[i]);    
                }
                else{
                    char value = map.get(a[i]);
                    if(value!=b[i]) return false;
                    else continue;
                }
            }
        }
        return true; 
    }
    public boolean isIsomorphic(String s, String t) {
        return checkIsomorphic(s,t) && checkIsomorphic(t,s);
    }
}
