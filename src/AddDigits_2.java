public class Solution {
    public int addDigits(int num) {
        while(num>=10)
            num-=9;
        
        return num;
    }
}

/*
	Simple math idea.
*/