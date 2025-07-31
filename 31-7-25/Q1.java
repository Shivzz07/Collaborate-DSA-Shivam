// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/submissions/1718280266

class Solution {
    public int[] runningSum(int[] nums) {
        helper(1,nums,nums.length);
        return nums;
    }
    private void helper(int index , int[] nums,int n)
    {
        if(index==n)
        {
            return;
        }

        nums[index]= nums[index-1]+nums[index];

        helper(index+1,nums,n);

    }
}