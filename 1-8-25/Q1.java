// 326. Power of Three
// https://leetcode.com/problems/power-of-three/submissions/1719804151

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0 || n < 0)
            return false;
        if (n == 1)
            return true;
        if (n % 3 != 0)
            return false;
        return helper(n, 0);
    }

    private boolean helper(int n, int t) {
        if (t >= 1) {
            return false;
        } else if (t == 0 && n == 1) {
            return true;
        }

        return helper(n / 3, n % 3);
    }
}