public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
            
        if(s.length()<=1)
            return true;
            
        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();
        
        for(int i=0; i<s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            
            if(map1.containsKey(sc) && map1.get(sc)!=tc)
                return false;
            if(map2.containsKey(tc) && map2.get(tc)!=sc)
                return false;
            
            map1.put(sc, tc);
            map2.put(tc, sc);
        }
        return true;
    }
}

/*
	Using two HashMap. Based on the definition, those two strings should be able to map every single element only from one to another.
	There is no 'one to mutiple' or 'multiple to one' situation. In this situation, either we check forward or backward from both strings,
	the key and value should match
*/