class Solution {
    public static int[] swap(int x, int y, int[] n){
        int t = n[x];
        n[x] = n[y];
        n[y] = t;
        return n;
    }
    public static int[] selectionSort(int[] nums1, int startIndex){
        //System.out.println("start "+startIndex);
        if(startIndex >= nums1.length) return nums1;
        int smallest = startIndex;
        int swapNeeded = 0;
        //int swapWith = 0;
        for(int i = startIndex;i< nums1.length;i++){
            if(nums1[smallest]>nums1[i]){
                //System.out.println(nums1[startIndex]+" "+nums1[smallest]);
                swapNeeded++;
                smallest = i;
            }
        }
        if(swapNeeded>0){
            nums1 = swap(smallest,startIndex,nums1);
        }
        return selectionSort(nums1,startIndex+1);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for(int i = m; i < (m+n);i++){
            nums1[i] = nums2[index];
            index++;
        }
        // for(int x:nums1){
        //     System.out.println(x+" ");
        // }
        nums1 = selectionSort(nums1,0);
        //}
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(nums2[j]<nums1[i]){

        //         }
        //     }
        // }
    }
}
