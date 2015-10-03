public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        
        for(int i=0; i<Math.pow(2,n); i++)
            res.add(i^i>>1);
        
        return res;
    }
}

/*
	https://en.wikipedia.org/wiki/Gray_code
	Based on the definition of Gray Code, and information from Wikipedia
*/