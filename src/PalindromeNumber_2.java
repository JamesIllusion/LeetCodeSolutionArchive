public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0))
            return false;
            
        int rev = 0;
        
        while(x>rev){
            rev = rev*10 + x%10;
            x/=10;
        }
        
        return(x==rev || x==rev/10);
    }
}

/*
	Reverse the input number and compare. Not even full number, just in middle
	PS. numbers equal 10 times should be exceptical condition to judge
*/