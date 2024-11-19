class Solution {
    public int addDigits(int num) {
        if(num<=9)
            return num;
        String str = Integer.toString(num);
        String arr[] = str.split("");
        int sum= 0;
        for(int i=0;i<arr.length;i++){
            sum  = sum + Integer.parseInt(arr[i]);
        }
        return addDigits(sum);
    }
}
