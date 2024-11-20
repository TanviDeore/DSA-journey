class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int i = 0;
        while(i<len){
            if(target == nums[i]) return i;
            else if(target > nums[i]){
                i++;
            }
            else if(target < nums[i]) return i;
        }
        return i;
    }
}
