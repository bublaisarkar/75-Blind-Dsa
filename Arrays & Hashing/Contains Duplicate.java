//Problem: 217. Contains Duplicate

// Given an integer array nums, return true if any value appears at least twice in the array, 
// and return false if every element is distinct.

//Soulution Code:

class Solution {
    /**
     * Checks if an array of integers contains any duplicate values.
     *
     * @param nums The input array of integers.
     * @return true if a duplicate exists, false otherwise.
     */
    public boolean containsDuplicate(int[] nums) {
        // Create a hashset to store the unique integers encountered so far.
        // A HashSet provides efficient O(1) average time complexity for add and contains operations.
        Set<Integer> intSet = new HashSet<>();

        // Iterate over each number in the input array.
        for (int num : nums) {
            // Check if the current number is already in our hashset.
            // If it is, we have found a duplicate.
            if (intSet.contains(num)) {
                return true;
            }
            // If the number is not a duplicate, add it to the set for future checks.
            intSet.add(num);
        }

        // If the loop completes without finding any duplicates, all elements are distinct.
        return false;
    }
}
/**
 * That's an excellent question to ask after solving a problem, as it helps you understand the efficiency of your solution. Here is a breakdown of the time and space complexity for the containsDuplicate solution.

Time Complexity
The time complexity of the solution is O(n), where n is the number of elements in the nums array.

The code iterates through each element of the input array exactly once.

Inside the loop, the intSet.contains(num) and intSet.add(num) operations on a HashSet have an average time complexity of O(1).

Because each element is processed in constant time on average, the total time required is directly proportional to the number of elements, resulting in a linear time complexity of O(n).

Space Complexity
The space complexity of the solution is O(n), where n is the number of elements in the nums array.

The algorithm uses a HashSet to store the unique numbers it encounters.

In the worst-case scenario, all elements in the input array are unique.

This means the HashSet will eventually store all n elements, requiring space proportional to the size of the input.

Therefore, the space complexity is linear, or O(n).
 */

