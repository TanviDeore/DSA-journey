class Solution {
    public int findClosestNumber(int[] nums) {
        int clst = Integer.MAX_VALUE;
        int max = 0;
        for(int ns: nums){
            if(Math.abs(0-ns)< Math.abs(0-clst) || (ns > clst && Math.abs(0-ns)==Math.abs(0-clst))) {
                //System.out.println("clst" +clst+" Nums "+ns);
                clst = ns;
            }    
        }
        return clst;
    }
}
