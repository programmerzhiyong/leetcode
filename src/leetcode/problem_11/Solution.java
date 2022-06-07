package leetcode.problem_11;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            max = Math.max(max,  Math.min(height[left], height[right]*(right - left)));
            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }
}
