class Solution {
    public int[] asteroidCollision(int[] asteroid) {
        Stack<Integer>st=new Stack<>();
        int n=asteroid.length;
        for(int i=0;i<n;i++){
            if(asteroid[i]>0)st.push(asteroid[i]);
            else{
                    //System.out.println(st.peek());
                    while(!st.isEmpty()&&st.peek()>0&&st.peek()<-asteroid[i])st.pop();
                    if(st.isEmpty()||st.peek()<0)
                    {
                       // System.out.println(st.peek());
                        st.push(asteroid[i]);
                    }
                
                    else if(st.peek()==-asteroid[i]){
                       // System.out.println(st.peek());
                        st.pop();
                                                   }
                    
                
          }
        }
        int []ans=new int[st.size()];
        
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}