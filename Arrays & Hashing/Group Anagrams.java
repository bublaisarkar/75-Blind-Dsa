// Problem: 49. Group Anagrams
// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// Solution Code:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Use a HashMap to store the groups. The key will be a sorted string.
        HashMap<String, List<String>> hm = new HashMap<>();

        for (String word : strs) {
            // Convert the word to a character array and sort it.
            // This creates a unique, canonical key for all anagrams.
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedWord = new String(ch);

            // Get the list for the sorted key. If the key doesn't exist, create a new list.
            if (!hm.containsKey(sortedWord)) {
                hm.put(sortedWord, new ArrayList<>());
            }
            // Add the original word to the list associated with the key.
            hm.get(sortedWord).add(word);
        }
        
        // Return a new list containing all the lists of anagrams from the HashMap's values.
        return new ArrayList<>(hm.values());
    }
}

/*
 * Time Complexity
The time complexity of this solution is O(n⋅klogk), where n is the number of strings in the input array and k is the average length of a string.

The solution iterates through each of the n strings in the input array.

For each string, the dominant operation is sorting its characters. Sorting an array of length k takes O(klogk) time.

All other operations inside the loop (converting to a character array, creating a new string, and HashMap operations) take time proportional to the string's length, O(k).

The total runtime is therefore the sum of the time for each string, which is n⋅O(klogk), or simplified to O(n⋅klogk).

Space Complexity
The space complexity is O(n⋅k), where n is the number of strings and k is the average length of a string.

The solution uses a HashMap to store the groups of anagrams.

In the worst case, all strings are unique and not anagrams of each other. The HashMap will store n keys, each of which is a string of average length k.

The values in the HashMap are the original strings, also of average length k.

Therefore, the total space required to store the keys and values in the HashMap is proportional to the total number of characters in the input, which is O(n⋅k).
 */