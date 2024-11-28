class Solution {
    public int[] productExceptSelf(int[] nums) {
        int countZero = 0;
        int productWithoutZero = 1;
        int indexZero = -1;
        int o[] = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            if(nums[i]==0){
                countZero++;
                if(countZero > 1) return o;
                indexZero = i;
            }
            else{
                productWithoutZero = productWithoutZero*nums[i];
            }
        }
        
        for(int i =0;i< nums.length;i++){
            if(countZero==1){
                o[indexZero] = productWithoutZero;
            }
            if(countZero==0){
                o[i] = productWithoutZero / nums[i];
            }
        }
        return o;
    }
}
