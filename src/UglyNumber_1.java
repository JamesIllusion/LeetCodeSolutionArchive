public class Solution {
    public boolean isUgly(int num) {
        boolean bUgly=false;
        
        if(num==0)
            bUgly=false;
        
        else if(num==1)
            bUgly=true;
        
        else{
            for(int i=2; i<6; i++){
                while(num%i==0)
                    num/=i;
            
                if(num==1)
                    bUgly=true;
                else
                bUgly=false;
            }
        }
        
        return bUgly;
    }
}

/*
	Defination: Ugly numbers are positive numbers whose prime factors only include 2, 3, 5
	Directly calculate based on the defination
*/
