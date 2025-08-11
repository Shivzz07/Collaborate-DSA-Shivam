// 1249. Minimum Remove to Make Valid Parentheses
// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/submissions/1731571367

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<HashMap<Character, Integer>> st = new Stack<>();
        Set<Integer> toRemove = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (c == '(') {
                HashMap<Character, Integer> map = new HashMap<>();
                map.put(c, i);
                st.push(map);
            } 
            else if (c == ')') 
            {
                if (!st.isEmpty() && st.peek().containsKey('(')) 
                {
                    st.pop(); 
                } 
                else 
                {
                    HashMap<Character, Integer> map = new HashMap<>();
                    map.put(c, i);
                    st.push(map);
                }
            }
        }
        
        while (!st.isEmpty()) 
        {
            HashMap<Character, Integer> map = st.pop();
            toRemove.addAll(map.values());
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) 
        {
            if (!toRemove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}