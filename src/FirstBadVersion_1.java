/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int badVer=0;
        int lo=1;
        int hi=n;
        int med=0;
        
        if(n==1)
            badVer=1;
        else
            while(lo<hi){
                med=(lo+(hi-lo)/2);
            
                if(isBadVersion(med))
                    hi=med;
                else
                    lo=med+1;
                
                badVer=lo;
            }
        
        return badVer;
    }
}