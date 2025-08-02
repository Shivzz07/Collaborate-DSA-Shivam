// 46. Permutations
// https://leetcode.com/problems/permutations/submissions/1721082724

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> np = new ArrayList<List<Integer>>();
        backtrack(np, new ArrayList(), nums);
        return np;
    }

    private void backtrack(List<List<Integer>> np, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            np.add(new ArrayList<>(temp));
            return;
        }

        for (int i : nums) {
            if (temp.contains(i))
                continue;

            temp.add(i);
            backtrack(np, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}