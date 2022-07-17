class Solution {
    public int nextGreaterElement(int n) {
  
        char[] num = String.valueOf(n).toCharArray();
        int size = num.length;
        for(int i = size - 1; i > 0; --i){
            if(num[i] > num[i-1]){
                for(int right = size - 1; right >= i; --right){
                    if(num[right] > num[i-1]){
                        swap(num, i-1, right);
                        reverse(num,i,size-1);
                        long ans =  Long.parseLong(String.valueOf(num));
                        return ans > Integer.MAX_VALUE ? -1 : (int)ans;
                    }    
                }
            }
        }
        return -1;
    }
    private void swap(char[] num, int i, int j){
            char temp = num[i];
            num[i] = num[j];
            num[j] = temp;
    }
    private void reverse(char[] num, int i, int j){
        while(i<j){
            swap(num,i,j);
            i++;
            j--;
        }
    }
   
}