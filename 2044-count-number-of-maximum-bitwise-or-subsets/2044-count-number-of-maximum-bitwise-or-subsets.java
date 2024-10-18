class Solution {
    static int countSubsets(int i,int currOr,int[]nums,int maxOr){
        if(i==nums.length){
           if(currOr==maxOr){
                return 1;
           }
            else
                return 0;
        }
        int takeCount=countSubsets(i+1,currOr|nums[i],nums,maxOr);
        int notTakeCount=countSubsets(i+1,currOr,nums,maxOr);
        return takeCount + notTakeCount;
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxOr=0;
        for( int num :nums){
           maxOr|=num;
        }
        int currOr=0;
        return countSubsets(0,currOr,nums,maxOr);
    }
}