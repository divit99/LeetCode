class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] arr) {
    Stack<Integer> stack=new Stack<>();
    int result[]=new int[arr.length];
   
//         for(int i=nums2.length-1;i>=0;i--){
//         if(!st.isEmpty()){
//             while(!st.isEmpty()&&st.peek()<=nums2[i]){
//                 st.pop();
//             }    
//         }
//             if(st.isEmpty())buff[i]=-1;
            
//             else  buff[i]=st.top();
                
            
//             st.push(nums2[i]);
        
//     }
            for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }
            else
                result[i]  = stack.peek();
            stack.push(arr[i]);
        }
        int ans[]=new int[nums1.length];
     HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],result[i]);
        }
        
        for(int i=0;i<nums1.length;i++){
           ans [i] = hm.get(nums1[i]);
        }
    
     
        return ans;
    }
}