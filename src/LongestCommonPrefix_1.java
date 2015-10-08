public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
            
        String pre = strs[0];
        
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
        
        return pre;
    }
}

/*
	If array is empty, then no prefix (return ""). Store the first string in array as temporary prefix. Checking through the array
	if the temp prefix is not in first place of all others strings, then cut 1 from the prefix.
*/