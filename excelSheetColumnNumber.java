class Solution {
    public int titleToNumber(String columnTitle) {
        String str = columnTitle;
        int ans = 0,num=0,power=0;
        for(int i = str.length()-1;i>=0;i--){
            num  = (int)Math.pow(26,power);
            power++;
            int rem  = str.charAt(i) - 'A' + 1;
            if(rem!=0){
                ans += num*(rem);
            }
            else{
                ans += rem;
            }
        }
        //System.out.println(num);
        return ans;
    }
}
