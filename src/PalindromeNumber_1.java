public class Solution {
    public boolean isPalindrome(int x) {
        String x_str = Integer.toString(x);
        
        int lo = 0, hi = x_str.length()-1;
        
        while(lo<x_str.length()-1 && hi>=0){
            if(x_str.charAt(lo)!=x_str.charAt(hi))
                return false;
            lo++;
            hi--;
        }
        
        return true;
    }
}

/*
	Two pointers go from both ends of string. If not same, then input is not palindrome.
*/