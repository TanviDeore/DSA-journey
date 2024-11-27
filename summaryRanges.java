class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start = 0;
        String s = "";
        List<String> l = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            if(i+1 == nums.length || nums[i+1]!=nums[i]+1){
                if(nums[start]!=nums[i]){
                    s = nums[start]+"->"+nums[i];
                }
                else{
                    s = ""+nums[start];
                }
                start  = i+1;
                l.add(s);
            }
           
            
        }
        return l;
    }
}
