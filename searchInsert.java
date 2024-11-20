class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        int i = 0;
        while(i<l){
            if(target == nums[i]) return i;
            else if(target > nums[i]){
                i++;
            }
            else if(target < nums[i]) return i;
        }
        return i;
    }
}
