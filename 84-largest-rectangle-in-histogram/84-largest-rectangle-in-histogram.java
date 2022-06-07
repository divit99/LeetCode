class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int [] right=new int[n];
        Stack<Integer> rt=new Stack<>();
        rt.push(n-1);
        right[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(rt.size()>0&&heights[i]<=heights[rt.peek()])rt.pop();
            if(rt.isEmpty())right[i]=n;
            else right[i]=rt.peek();
            rt.push(i);
        }
      
        
        int [] left=new int[n];
        
        Stack<Integer> lt=new Stack<>();
        lt.push(0);
        left[0]=-1;
        for(int i=1;i<n;i++){
            while(lt.size()>0&&heights[i]<=heights[lt.peek()])lt.pop();
            if(lt.isEmpty())left[i]=-1;
            else left[i]=lt.peek();
            lt.push(i);
        }
        //for(int i=0;i<n;i++)System.out.println(right[i]+" "+left[i]);
        int max=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int temp=heights[i]*width;
            if(temp>max){max=temp;
                       // System.out.println(i+" "+temp);
                        }
        }
        return max;
    }
}