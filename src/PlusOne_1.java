public class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = digits;
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }
            else
                digits[i] = 0;
        }
        
        if(digits[0]==0){
            int[] temp = new int[digits.length+1];
            temp[0] = 1;
            digits = temp;
        }
        
        return digits;
    }
}