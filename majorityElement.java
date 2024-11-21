class Solution {
    public int majorityElement(int[] nums) {
        // int l = nums.length/2;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int x: nums){
        //     if(map.containsKey(x)){
        //         int v = map.get(x)+1;
        //         map.put(x,v);
        //     }
        //     else{
        //         map.put(x,1);
        //     }
        // } 
        // int r = 0,n = 0;
        // for(Map.Entry<Integer,Integer> m: map.entrySet()){
        //     if(m.getValue()>l){
        //         r = m.getKey();
        //     }
        //     //System.out.println(m.getKey()+" "+m.getValue());
        // }
        // return r;

        Arrays.sort(nums);
        // for(int n: nums){
        //     System.out.println(n);
        // }
        int l =(nums.length/2);
        return nums[l];
    }
}
