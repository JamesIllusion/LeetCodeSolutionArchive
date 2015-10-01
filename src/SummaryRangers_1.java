public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        
        if(nums.length==1){
            res.add(nums[0]+"");
            return res;
        }
        
        int count = 0;
        
        for(int i=0; i<nums.length; i++){
            int start = nums[i];
            while(i+1<nums.length && nums[i+1]==nums[i]+1)
                i++;
                
            if(start!=nums[i])
                res.add(start+"->"+nums[i]);
            else
                res.add(start+"");
        }
        
        return res;
    }
}

/*
	For all elements in the array, if the next element is only 1 bigger than current one, range extends; if not, current range
	terminates and start a new count
*/