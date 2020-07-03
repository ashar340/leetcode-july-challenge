/* You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

 */
#include <stdio.h>
#include <math.h>
class Solution {
    public:
    int arrangeCoinsStaircase(int n) {
        unsigned int num = 2 * n;
        int output = static_cast<int>(sqrt(num + 0.25) - 0.5);

        return output;
    }
};