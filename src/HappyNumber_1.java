public class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7)
            return true;
            
        int n_tmp = cal(n);
        while(n_tmp>=10)
            n_tmp = cal(n_tmp);
        
        if(n_tmp==1 || n_tmp==7)
            return true;
        else
            return false;
    }
    
    int cal(int n){
        int tmp = 0;
        
        while(n>=1){
            tmp+=(n%10)*(n%10);
            n/=10;
        }
        
        return tmp;
    }
}