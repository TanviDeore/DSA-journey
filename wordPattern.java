class Solution {
    public static Character checkIfValueExists(HashMap<Character,String> m, String s){
        for(Map.Entry<Character,String> x: m.entrySet()){
            if(x.getValue().equals(s)) return x.getKey();
        }
        return null;
    }
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> m = new HashMap<>();
        char[] p = pattern.toCharArray();
        String[] s1 = s.split(" ");
        if(p.length!=s1.length) return false;
        for(int i = 0;i<p.length;i++){
            if(!m.containsKey(p[i])){
                if(checkIfValueExists(m,s1[i])==null) m.put(p[i],s1[i]);
                else return false;  
            }
            else{
                String v = m.get(p[i]);
                if(!v.equals(s1[i])) return false;
            }
        }
        return true;
    }
}
