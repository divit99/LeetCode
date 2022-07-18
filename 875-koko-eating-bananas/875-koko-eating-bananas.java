class Solution {
    
    public boolean ans(int mid,int arr[],int h){
        
         int temp=0;
            for(int j=0;j<arr.length;j++){
                int curr=arr[j]/mid;
                if(arr[j]%mid>0)curr++;
                temp+=curr;
            }
            System.out.println(temp+" "+mid);
            
        
        return temp<=h&&temp>0;
        
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        Arrays.sort(piles);
        int speed=0;
        int start=1;
        int end=piles[piles.length-1];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ans(mid,piles,h)){
                speed=mid;
                end=mid-1;
            }
         else start=mid+1;
        }
        return speed;
        
     
        
    }
}