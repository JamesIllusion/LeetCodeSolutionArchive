public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
    
        while (n > 0){
            int r = n % 26;
            n = n/26;
                if (r != 0)
                    sb.append((char)(r - 1 + 'A'));
                else{
                    sb.append('Z');
                    n--;
                }
    }
    return sb.reverse().toString();
    }
}

/*
	Similar to Binary - Decimal conversion. mod 26 to get the last char and then divide 26 to short digit.
	PS. when there is a 'z', which means mod 26 return 0, minus 1 to short a digit
*/