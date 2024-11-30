class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i< s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        int pLen = 0;boolean hasOdd = false;
        for(Map.Entry<Character, Integer> x: map.entrySet()){
            if(x.getValue()%2==0){
                pLen = pLen + x.getValue();
            }
            if(x.getValue()%2!=0){
                int temp = x.getValue()-1;
                pLen = pLen + temp;
                hasOdd = true;
            }
        }

        if(pLen%2==0){
            if(hasOdd){
                pLen++;
            }
        }
        return pLen;
    }
}
