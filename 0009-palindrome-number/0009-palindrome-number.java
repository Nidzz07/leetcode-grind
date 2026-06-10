class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; 
        
        int rev = 0;
        int m = x;
        
        while (m > 0) {
            int digit = m % 10;
            m = m / 10;
            rev = rev * 10 + digit;
        }
        
        return rev == x;
    }
}