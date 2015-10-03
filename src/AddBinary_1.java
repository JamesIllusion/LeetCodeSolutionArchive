public class Solution {
    public String addBinary(String a, String b) {
        if(a.isEmpty())
            return b;
        if(b.isEmpty())
            return a;
            
        StringBuilder stb = new StringBuilder();
        
        int aIn = a.length()-1;
        int bIn = b.length()-1;
        int aBit, bBit;
        int carry=0, res=0;
        
        while(aIn>=0 || bIn>=0 || carry==1){
            aBit = (aIn>=0) ? Character.getNumericValue(a.charAt(aIn--)) : 0;
            bBit = (bIn>=0) ? Character.getNumericValue(b.charAt(bIn--)) : 0;
            res = aBit^bBit^carry;
            carry = ((aBit+bBit+carry)>=2) ? 1 : 0;
            stb.append(res);
        }
        
        return stb.reverse().toString();
    }
}

/*
	Using XOR to calculate for each digit in result, and take care of carry digit
*/