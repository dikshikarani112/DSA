package Practice;

import org.w3c.dom.Node;

import java.util.HashSet;

public class LongestSubstring {

    /*
    * 1️⃣ Maintain a window of unique characters
      2️⃣ Expand window if character not repeated
      3️⃣ If repeated → remove characters from left
      4️⃣ Track maximum length
    * */

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right <s.length(); right++) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        //String s = "abcabcbb";
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
