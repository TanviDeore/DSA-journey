    class Solution {
        public int removeDuplicates(int[] nums) {
            int l = nums.length;
            int i =0;
            
            int count = 0;
            while(i<l){
                int j = i+1;
                while(j<l && nums[i]==nums[j]){
                    j++;
                }
                //when nums[i]!=nums[j], at j we have unique element
                nums[count++] =  nums[i];
                i = j;
            }
            return count;
        }
    }
