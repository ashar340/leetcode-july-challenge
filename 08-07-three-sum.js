/* 
15. 3Sum
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
] 
*/

const threeSum = function(nums) {
  const output = [];
  nums.sort((a,b) => a - b);

  for(let i = 0; i < nums.length - 2; i++){
    if(nums[i] > 0 || nums[nums.length] < 0) break;
    if(i > 0 && nums[i] === nums[i-1]) continue;

    let lo = i + 1;
    let hi = nums.length - 1;

    while(lo < hi) {
      const sum = nums[i] + nums[lo] + nums[hi];

      if(sum > 0) {
        hi -= 1;
      } else if(sum < 0) {
        lo += 1;
      } else {
        output.push([nums[i], nums[lo], nums[hi]]);
        while(lo < hi && nums[lo] === nums[lo + 1]) {
          lo += 1;
        }
        while(lo < hi && nums[hi] === nums[hi - 1]) {
          hi -= 1;
        }
        lo += 1;
        hi -= 1;
      }
    }
  }
  return output;
}