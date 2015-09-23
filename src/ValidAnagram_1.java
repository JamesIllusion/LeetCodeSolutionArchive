public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
            
        int[] compare = new int[26];
        
        for(int i=0; i<s.length(); i++)
            compare[s.charAt(i)-'a']++;
            
        for(int i=0; i<t.length(); i++)
            compare[t.charAt(i)-'a']--;
            
        for(int i=0; i<compare.length; i++)
            if( compare[i]!=0)
                return false;
                
        return true;
    }
}

/*
	For each word string s, count appear times for every character in this word, record in a map;
	and then for the other string t, if it is an ANAGRAM to s, it would eliminate the word count map built from s
*/	