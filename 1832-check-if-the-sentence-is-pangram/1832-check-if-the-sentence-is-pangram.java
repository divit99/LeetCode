class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean check[]=new boolean [26]; //
        
        int ans=26;//to calculate ans
        
        for(int i=0;i<sentence.length();i++){
            
            
            char curr=sentence.charAt(i);
            
            if(!check[curr-'a']){
                check[curr-'a']=true;
                ans--;
                if(ans==0)return true;
            }
            
        }
        
        return false;
        
        
        
    }
}