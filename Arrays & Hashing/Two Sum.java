// Problem: 1. Two Sum

/*  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

// Solution Code:

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Correctly initialize a HashMap with Integer keys and Integer values.
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Iterate through the array to find the two numbers.
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target.
            int complement = target - nums[i];

            // Check if the complement already exists as a key in the map.
            if (hm.containsKey(complement)) {
                // If it exists, we have found the two indices.
                // hm.get(complement) retrieves the index of the complement.
                // i is the index of the current number.
                return new int[]{hm.get(complement), i};
            }

            // If the complement is not found, add the current number and its index to the map.
            hm.put(nums[i], i);
        }

        // If no two numbers add up to the target, return null.
        return null;
    }
}


/*
 * Time Complexity
The time complexity of the twoSum solution is O(n), where n is the number of elements in the nums array.

Iteration: The core of the algorithm is the for loop, which iterates through each element of the array exactly once. This alone contributes a time complexity of O(n).

HashMap Operations: Inside the loop, two key HashMap operations are performed: hm.containsKey() and hm.put().

On average, containsKey() takes O(1) time.

On average, put() takes O(1) time.

Since these constant-time operations are performed inside a loop that runs n times, the total time complexity is dominated by the loop, resulting in a linear time complexity of O(n).

Space Complexity
The space complexity of the twoSum solution is O(n), where n is the number of elements in the nums array.

Auxiliary Space: The algorithm uses a HashMap to store key-value pairs (num, index).

Worst-Case Scenario: In the worst-case scenario, no two numbers add up to the target until the last element. The loop will run through almost the entire array before finding a solution (or completing without one).

Space Usage: For each element processed, a new entry is added to the HashMap. This means that the size of the HashMap can grow up to n elements.

Because the memory usage of the HashMap grows linearly with the size of the input array, the space complexity is also linear, or O(n).
 */

