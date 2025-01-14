// class Solution {
//     public int maxArea(int[] height) {
//         if(height.length==2) return (1*Math.min(height[0],height[1]));
//         int w = 1;
//         int h = 0;
//         int max = 0;
//         int i = 0;
//         while(i<height.length-1 && w <= height.length){
//             int j = i+1;
//             while(j<height.length){
//                 h = Math.min(height[i],height[j]);
//                 w = j - i;
//                 if((h*w) > max) max = h*w;
//                 j++;
//             }
//             i++;
//         }
//         //System.out.println(max);
//         return max;
//     }
// }
//Optimized code
class Solution {
    public int maxArea(int[] h) {
        int sum = 0;
        int L =0;
        int R = h.length-1;
        while(L<R){
            int w = R-L;
            int ht = Math.min(h[L],h[R]);
            if((ht * w) > sum){
                sum = ht*w;
            }
            if(h[L]<h[R]) L++;
            else R--;
    }
    return sum;
    }
}
