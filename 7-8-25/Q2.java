// 78. Subsets
// https://leetcode.com/problems/subsets/submissions/1726883212

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> np = new ArrayList<List<Integer>>();
        backtrack(np, new ArrayList(), nums,0);
        return np;
    }

    private void backtrack(List<List<Integer>> np, List<Integer> temp, int[] nums , int index) {

        if(index==nums.length)
        {
            np.add(new ArrayList<>(temp));
            return;
        }
        
            backtrack(np, temp, nums,index+1);
            temp.add(nums[index]);

            backtrack(np, temp, nums,index+1);
            temp.remove(temp.size() - 1);
           
            
    }
}