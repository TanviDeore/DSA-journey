class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
//O(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i =0;i<=nums.length-1;i++){
            int needed = target - nums[i];
            if(map.containsKey(needed) && i != map.get(needed)){
                answer[0] = i;
                answer[1] = map.get(needed);
                return answer;
            }
        }
        return answer;
    }
    
    //     O[n^2]
    //     int sum = 0;
    //     for(int i =0;i<nums.length;i++){
    //         sum=0;
    //         for(int j=i+1;j<nums.length;j++){
    //             answer[0] = i;
    //             answer[1] = j;
    //             sum  = nums[i] + nums[j];
    //             if(sum==target){ return answer;}
    //         }
    //         if(sum!=target) continue;
    //     }
    //  return answer;  
    // }
     
}
