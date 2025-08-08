// 39. Combination Sum
// https://leetcode.com/problems/combination-sum/submissions/1728003478

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> np = new ArrayList<>();
        solve(np,new ArrayList<>(),candidates,target,0);
        return np;
    }
    private void solve(List<List<Integer>> np , List<Integer> temp , int[] candidates , int target, int current)
    {
        if(target==0)
        {
            np.add(new ArrayList<>(temp));
            return;
        }
        if(target<0)
        {
            return;
        }
        if(current==candidates.length)
        {
            return;
        }

        temp.add(candidates[current]);
        solve(np,temp,candidates,target-candidates[current],current);

        temp.remove(temp.size()-1);
        solve(np,temp,candidates,target,current+1);


    }
}