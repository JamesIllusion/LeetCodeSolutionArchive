public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int len = Math.max(v1.length, v2.length);
        
        for(int i=0; i<len; i++){
            Integer iV1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            Integer iV2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            
            if(iV1>iV2) return 1;
            if(iV1<iV2) return -1;
        }
        
        return 0;
    }
}

/*
	Using String split to save strings and compare
	Ps. if length not same, use 0 to hold position and make two strings' length equal
*/