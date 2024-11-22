class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int r[] = new int[26];
        int m[] = new int[26];

        for(int i = 0; i< ransomNote.length();i++){
            int index = ransomNote.charAt(i) - 'a';
            r[index]++;
        }
        for(int i = 0; i< magazine.length();i++){
            int index = magazine.charAt(i) - 'a';
            m[index]++;
        }
        boolean ret = true;
        for(int i =0;i< 26;i++){
            if(r[i]!=0){
                //System.out.println("r[i] "+r[i]);
                //System.out.println("m[i] "+m[i]);
                if(r[i]>m[i]) return false;
            }
        }
        return ret;

    }
}
