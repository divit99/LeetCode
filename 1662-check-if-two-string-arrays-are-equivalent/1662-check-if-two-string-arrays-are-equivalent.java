class Solution {
 public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = ""; 
        String str2 = ""; 
        
        //Add array elements into declared variables
        for(int i = 0; i<word1.length; i++){
            str1 += word1[i];
        }
        for(int i = 0; i<word2.length; i++){
            str2 += word2[i];
        }
        
        //Check if both variables are the same using .equals()
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}