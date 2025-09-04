// Problem: 242. Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Solution Code:

class Solution {
    public boolean isAnagram(String s, String t) {
        // If the lengths are different, they can't be anagrams.
        if (s.length() != t.length()) {
            return false;
        }

        // Use an array to count character frequencies.
        // Assuming the strings contain only lowercase English letters.
        int[] count = new int[26];

        // Iterate through both strings simultaneously.
        for (int i = 0; i < s.length(); i++) {
            // Increment count for characters in string 's'.
            count[s.charAt(i) - 'a']++;
            // Decrement count for characters in string 't'.
            count[t.charAt(i) - 'a']--;
        }

        // After iterating, all counts must be zero for them to be anagrams.
        // If any count is non-zero, it means a character appeared a different number of times.
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        // If the loop completes, all counts are zero, so they are anagrams.
        return true;
    }
}

/*
 * Time Complexity
The time complexity of the isAnagram solution is O(n), where n is the length of the input strings s and t.

Initial Check: The length comparison s.length() != t.length() is a constant time operation, O(1).

First Loop: The main part of the algorithm is the for loop that iterates from i=0 to i<n. This loop runs a total of n times. Inside the loop, the operations s.charAt(i) - 'a' and count[...]++ are all constant time operations, O(1). Therefore, the total time for this loop is O(n).

Second Loop: The second loop iterates through the count array. The size of this array is fixed at 26 (for the lowercase English alphabet). This means the loop always runs exactly 26 times, regardless of the input string length. This is a constant time operation, O(26), which simplifies to O(1).

Since the first loop's time complexity of O(n) dominates the constant time operations, the overall time complexity is O(n).

Space Complexity
The space complexity of the isAnagram solution is O(1) or constant space.

The algorithm uses a single integer array, int[] count, of size 26.

The size of this array does not depend on the size of the input strings. It will always be 26, even if the strings were millions of characters long.

Because the amount of memory used does not grow with the input size, the space complexity is considered constant, or O(1).

This solution is highly efficient because it achieves a linear time complexity while using a minimal, constant amount of space.
 */