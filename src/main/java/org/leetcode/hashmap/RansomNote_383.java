package org.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            int currentCount = charMap.getOrDefault(c, 0);
            charMap.put(c, currentCount + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            int currentCount = charMap.getOrDefault(c, 0);
            if (currentCount == 0) return false;

            charMap.put(c, currentCount - 1);
        }

        return true;

    }
}
