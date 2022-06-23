class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm=new HashMap();
        
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],true);
        }
      for(int i=0;i<nums.length;i++){
          if(hm.containsKey(nums[i]+1))  
          hm.put(nums[i]+1,false);
        }
        int maxlength=0;
         for(int i=0;i<nums.length;i++){
             if(hm.get(nums[i])){
                 
                 int temp=1;
                 while(hm.containsKey(nums[i]+temp)){
                     temp++;
                 }
                 if(temp>maxlength)maxlength=temp;
             }
            //hm.put(nums[i],true);
        }
        return maxlength;
    }
}