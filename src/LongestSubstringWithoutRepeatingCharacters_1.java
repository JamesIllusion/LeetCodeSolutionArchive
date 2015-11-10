public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
            
        int loc=0, left=0, max=0;
        HashSet<Character> hset = new HashSet<Character>();
        
        while(loc<s.length()){
            if(!hset.contains(s.charAt(loc))){
                hset.add(s.charAt(loc++));
                max = Math.max(max, hset.size());
            }
            else{
                hset.remove(s.charAt(left));
                left++;
            }
        }
       
       return max;
    }
}

/*
	Check from the beginning, if the character is not repeated, then add to hashset, if it is, then remove one element from 
	the hashset. Compare the max number in the end
*/