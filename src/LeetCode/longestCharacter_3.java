package LeetCode;
/*Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/

import java.util.HashSet;

public class longestCharacter_3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestCharacter_3.lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        int lengthOfString = 0;
        int a_pointer = 0;
        int b_pointer = 0;

        HashSet<Character> hashSet = new HashSet<>();
        if (s.length() == 0 || s.length() == 1) {
            lengthOfString = s.length();
        } else {

            while (b_pointer < s.length()) {

                if (!hashSet.contains(s.charAt(b_pointer))) {
                    hashSet.add(s.charAt(b_pointer));
                    b_pointer++;
                    lengthOfString = Math.max(hashSet.size(), lengthOfString);
                } else {
                    hashSet.remove(s.charAt(a_pointer));
                    a_pointer++;
                }
            }
//        }
            return lengthOfString;
        }
        return lengthOfString;
    }
}
