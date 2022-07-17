class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int l1=1,l2=0;
        
        Stack<Integer> st=new Stack();
        
        st.push(pushed[0]);
        
        while(l1<=pushed.length){
            if(!st.isEmpty()&&st.peek()==popped[l2]){
            System.out.println(st.peek());
                st.pop();
            
                l2++;
            }
            else{
                if(l1<pushed.length)
                st.push(pushed[l1]);
                l1++;
            }
        }
        if(st.isEmpty())return true;
        else return false;
        
        
    }
}