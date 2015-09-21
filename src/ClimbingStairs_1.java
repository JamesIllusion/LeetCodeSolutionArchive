public class Solution {
    public int climbStairs(int n) {
        int methodCount = 0;
 
        if(n<=0)
            methodCount=0;
        if(n==1)
            methodCount=1;
        if(n==2)
            methodCount=2;

//  Basic idea from the quesiton, solved by recursive            
//        while(n>2)
//            methodCount += climbStairs(n-1) + climbStairs(n-2);

        int methodCount_one = 2;
        int methodCount_two = 1;
        
        for(int i=3; i<=n; i++){
            methodCount = methodCount_one + methodCount_two;
            methodCount_two = methodCount_one;
            methodCount_one = methodCount;
        }
        
        
        return methodCount;
    }
}