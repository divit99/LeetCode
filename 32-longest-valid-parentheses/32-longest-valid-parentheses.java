class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character>st=new Stack<>();
        Stack<Integer> problem=new Stack<>();
        int maxLength=0;
        problem.push(-1);
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('){
                st.push(a);
                problem.push(i);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                    problem.pop();
                    int len=i-problem.peek();
                    if(maxLength<len)maxLength=len;
                }
                else {
                    problem.push(i);
                }
            }
        }
        return maxLength;
    }
}