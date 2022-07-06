class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack();
        
        for(int i=0;i<s.length();i++){
          //  st.push(s.charAt(i));
            //System.out.println(st.pop());
            char temp=s.charAt(i);
            //System.out.println(temp+" "+i);
           // if(!st.isEmpty())System.out.println(st.peek());
            if(temp=='('||temp=='{'||temp=='[')st.push(temp);
            else if(temp==')'&&!st.isEmpty()&&st.peek()=='(')st.pop();
            else if(temp=='}'&&!st.isEmpty()&&st.peek()=='{')st.pop();
            else if(temp==']'&&!st.isEmpty()&&st.peek()=='[')st.pop();
            else return false;
        }
        //System.out.println(st.size());
        if(st.isEmpty())return true;
        else return false;
    }
}