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
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<arr.length;j++){
                if(nums1[i]==arr[j]){
                    ans[i]=result[j];
                    break;
                }
            }
        }
        return ans;
    }
}