public class Solution {
    public int countPrimes(int n) {
        if(n<2)
            return 0;
        
        int res = 0;
        boolean[] notPrime = new boolean[n];
        notPrime[0] = notPrime[1] = true;
        
        for(int i=2; i*i<n; i++){
            if(!notPrime[i]){
				for(int j=i*i; j<n; j+=i)
					notPrime[j] = true;
            }
        }
        
        for(int i=0; i<n; i++)
            if(notPrime[i]==false)
                res++;
        
        return res;
    }
}

/*
	http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
	For every number - n starting from 2, n*m is always not a prime. And when processing this step, we can start from n*n,
	since all elements smaller than n*n will be covered than previous elements.
*/