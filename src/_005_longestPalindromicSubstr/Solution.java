package _005_longestPalindromicSubstr;

public class Solution {

    private int maxLen = 0;
    private String sub = "";

    public String longestPalindrome(String s) {
        if(s.length() <= 1)
            return s;

        for(int i = 0; i < s.length() - 1; i++){
            findLongestPalindrome(s, i, i);
            findLongestPalindrome(s, i, i+1);
        }

        return sub;
    }

    private void findLongestPalindrome(String s, int low, int high){
        while (low >= 0 && high <= s.length()-1){
            if(s.charAt(low) == s.charAt(high)){
                if(high - low + 1 > maxLen){
                    maxLen = high - low + 1;
                    sub = s.substring(low , high+1);
                }
                low --;
                high ++;
            }
            else
                break;
        }
    }
}
