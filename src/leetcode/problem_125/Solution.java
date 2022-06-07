package leetcode.problem_125;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Never a foot too far, even."));
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (leftChar == rightChar || ((leftChar + 32 == rightChar || leftChar - 32 == rightChar)
                    && Character.isLetter(leftChar) && Character.isLetter(rightChar))) {
                left++;
                right--;
            } else if (Character.isLetterOrDigit(leftChar) && Character.isLetterOrDigit(rightChar))
                return false;
            else if (!Character.isLetterOrDigit(leftChar)) left++;
            else if (!Character.isLetterOrDigit(rightChar)) right--;
        }
        return true;
    }
}
