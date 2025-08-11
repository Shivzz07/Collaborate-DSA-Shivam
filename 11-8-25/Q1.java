// 682. Baseball Game
// https://leetcode.com/problems/baseball-game/submissions/1731472552

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++)
        {
           
            if((operations[i].compareTo("C")!=0) && (operations[i].compareTo("D")!=0) && (operations[i].compareTo("+")!=0))
            {
                st.push(Integer.parseInt(operations[i]));
            }
            if((operations[i].compareTo("C")==0))
            {
                st.pop();
            }
            if((operations[i].compareTo("D")==0))
            {
                int n = st.peek();
                st.push(n*2);
            }
            if((operations[i].compareTo("+")==0))
            {
                int n1 = st.pop();
                int n2 = st.pop();
                st.push(n2);
                st.push(n1);
                st.push(n1+n2);
            }
        }
        if(st.isEmpty())
        {
            return 0;
        }
        while (!st.isEmpty()) 
        {
            sum += st.pop();
        }
        return sum;
    }
}