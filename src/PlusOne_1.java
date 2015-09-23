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

/*
	Straight forward solution. Simply add 1 at the last digit (right most element in the array). If there is 
	carry over, then add to next digit. If there is carry over at the first digit (left most element in the array),
	it is already '0' (10 = {1,0}) and then create a new digit in the array.
*/