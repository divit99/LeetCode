class Solution {
    
    public void findCombinatios (String output, String input, List<String> result){
        if(input.isEmpty() && !output.isEmpty()){
            result.add(output);
        }
        if(input.isEmpty()){
            return;
        }
        
        int digit = input.charAt(0) - '0';
        if(digit == 7){
            for(int i = (digit-2)*3; i<=(digit-1)*3; i++){
            char ch = (char) ('a' + i);
            findCombinatios(output + ch, input.substring(1), result);
            }
        }
        else if (digit == 8){
            for(int i = 19; i<22; i++){
            char ch = (char) ('a' + i);
            findCombinatios(output + ch, input.substring(1), result);
            }
        }
        else if (digit == 9){
            for(int i = 22; i<26; i++){
            char ch = (char) ('a' + i);
            findCombinatios(output + ch, input.substring(1), result);
            }
        }else{
            for(int i = (digit-2)*3; i<(digit-1)*3; i++){
            char ch = (char) ('a' + i);
            findCombinatios(output + ch, input.substring(1), result);
            }
        }
    }
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        findCombinatios("", digits, result);
        return result;
    }
}