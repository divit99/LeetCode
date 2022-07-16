/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        if(n==1)return 1;
        
        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(isBadVersion(mid)){
                if(mid!=1&&!isBadVersion(mid-1))return mid;
                else if(mid==1)return mid;
                end=mid-1;
            }
            else start=mid+1;
            
        }
        return -1;
    }
}