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


        int methodCount_two_before = 2;		// at first step
        int methodCount_one_before = 1;		// at second step
        
        for(int i=3; i<=n; i++){
            methodCount = methodCount_two_before + methodCount_one_before;
            methodCount_one_before = methodCount_two_before;
            methodCount_two_before = methodCount;

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

/*
	Dynamic Programming problem. 1 method to climb stair 1; 2 methods to climb stair 2. From stair 3,
	the method count equals the method count 1 step before plus 2 steps before.
*/