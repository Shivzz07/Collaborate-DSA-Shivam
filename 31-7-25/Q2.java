// 344. Reverse String
// https://leetcode.com/problems/reverse-string/submissions/1718403114

class Solution 
{
    public void reverseString(char[] s) {
        helper(0,s.length-1,s,s.length);
    }
    private void helper(int left, int right, char[] s , int n)
    {
        if(n%2==0)
        {
            if(left>right)
            {
            return;
            }
        }
        else
        {
            if(left==right)
            {
                return;
            }
        }
        

        char temp = s[right];
        s[right] = s[left];
        s[left] = temp;

        helper(left+1,right-1,s,n);
    }
}