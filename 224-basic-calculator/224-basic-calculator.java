class Solution {
    public int calculate(String s) {
        int sum=0;
        int op=1;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            //System.out.println(a);
            if(Character.isDigit(a)){
                int num=0;
                while(i<s.length()&&Character.isDigit(s.charAt(i))){
                    num=num*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                num*=op;
                sum+=num;
                op=1;
                
               // System.out.println(sum);
            }
            else if(a=='('){
                st.push(sum);
                st.push(op);
                sum=0;
                op=1;
            }else if(a==')'){
                sum*=st.peek();
                st.pop();
                sum+=st.peek();
                st.pop();
            }else if(a=='-'){
               // System.out.println(1);
                op*=-1;
            }
            
            
        }
            return sum;
        
    }
}