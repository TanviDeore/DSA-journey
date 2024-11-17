class Solution {
    // o(n) using hashmap
     public int singleNumber(int[] nums) {
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         if(!map.containsKey(nums[i])){
    //             map.put(nums[i],1);
    //         }   
    //         else{
    //             map.put(nums[i],map.get(nums[i])+1);
    //         }
    //     }
    //     for(Map.Entry<Integer,Integer> e:map.entrySet()){
    //         if(e.getValue()==1) return e.getKey();
    //     }
    //     return 0;


    //using xor
    int result=0;
    for (int n : nums){
        result = result^ n;
    }
    return result;
    }
}
