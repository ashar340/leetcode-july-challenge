/* 
Ugly Number II
Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 

Example:

Input: n = 10
Output: 12
Explanation: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
Note:  

1 is typically treated as an ugly number.
n does not exceed 1690.
 */

class Ugly {
    public int[] nums = new int[1690];

    Ugly() {
        nums[0] = 1;
        int ugly = 0;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        for (int i = 1; i < 1690; i++) {
            ugly = Math.min(Math.min(nums[p2] * 2, nums[p3] * 3), nums[p5] * 5);
            nums[i] = ugly;

            if (ugly == nums[p2] * 2)
                p2++;
            if (ugly == nums[p3] * 3)
                p3++;
            if (ugly == nums[p5] * 5)
                p5++;

        }
    }
}

class Solution {
    public static Ugly ugly = new Ugly();

    public int nthUglyNum(int n) {
        return ugly.nums[n - 1];
    }
}