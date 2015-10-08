public class Solution {
    public boolean wordPattern(String pattern, String str) {
//        char[] pattern_array = pattern.toCharArray();
        String[] words = str.split(" ");
        
        if (words.length != pattern.length())
            return false;
        
        Map<Character,String> map = new HashMap();

        for(int i=0; i<pattern.length(); i++){
            char pt = pattern.charAt(i);
            if(!map.containsKey(pt)){
                if (map.containsValue(words[i]))
                    return false;
                map.put(pt, words[i]);
            }
            else{
                if(!words[i].equals(map.get(pt)))
                    return false;
            }
        }
        return true;
    }
}

/*
	Split str into array of string. For each index in both string, if (pattern - str) is not seen, save it to hashmap; if the pattern
	is seen, compare value and current str, if not same, return false, if same, keep checking
*/