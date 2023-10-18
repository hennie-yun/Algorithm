class Solution {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        int i = value.length();

        for (int n =0; n<i/2; n ++ ) {
            if (value.charAt(n) != value.charAt(i-n-1))
            return false; 
        }

        return true;
    }
}