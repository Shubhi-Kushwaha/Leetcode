class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        while(i<n){
            for(int j=i+1;j <= i + k && j<n;j++){
              if((nums[i]==nums[j])&&(Math.abs(i-j)<=k)){
                return true;
              }
            }
            i++;

        }
        return false;
    }
    
}