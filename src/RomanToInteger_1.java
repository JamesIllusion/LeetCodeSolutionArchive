public class Solution {
    public int romanToInt(String s) {
        int result=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='I')
                result+=1;
            else if(s.charAt(i)=='V')
                result+=5;
            else if(s.charAt(i)=='X')
                result+=10;
            else if(s.charAt(i)=='L')
                result+=50;
            else if(s.charAt(i)=='C')
                result+=100;
            else if(s.charAt(i)=='D')
                result+=500;
            else if(s.charAt(i)=='M')
                result+=1000;
            else
                System.out.println("There must be something wrong, please check.");
        }
        
        if(s.contains("CD"))
            result-=200;
        if(s.contains("CM"))
            result-=200;
        if(s.contains("XL"))
            result-=20;
        if(s.contains("XC"))
            result-=20;
        if(s.contains("IV"))
            result-=2;
        if(s.contains("IX"))
            result-=2;        
        
        return result;
    }
}