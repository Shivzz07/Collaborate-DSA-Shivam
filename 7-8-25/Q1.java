// 77. Combinations
// https://leetcode.com/problems/combinations/submissions/1726769798

class Solution {
    public List<List<Integer>> combine(int n, int k) {
     List<List<Integer>> np = new ArrayList<List<Integer>>();
      backtrack(np, new ArrayList(), n,k);
        return np;
    }

    private void backtrack(List<List<Integer>> np, List<Integer> temp, int n,int k) 
    {
        if (k==0) 
        {
            np.add(new ArrayList<>(temp));
            return;
        }
        if(n==0)
        {
            return;
        }

            temp.add(n);
            backtrack(np, temp, n-1,k-1);

            temp.remove(temp.size() - 1);
            backtrack(np, temp, n-1,k);
    }
    
}