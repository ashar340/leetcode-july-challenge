/* 
461. Hamming Distance
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
 */

class Solution {
    public int hammingDistance_lib(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public int hammingDistance_bitCount(int x, int y) {
        int sum = 0;
        for(int i = 0; i < 32; i++)
        {
            if ( (x & 1) != (y & 1) )
                sum ++;
            x = x >>1
        }
    }
}