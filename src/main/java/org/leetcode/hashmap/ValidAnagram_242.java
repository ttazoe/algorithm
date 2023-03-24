package org.leetcode.hashmap;

public class ValidAnagram_242 {
  public boolean isAnagram(String s, String t) {
    int[] alphabet = new int[26];
    for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
    for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
    for (int i : alphabet) if (i != 0) return false;
    return true;
  }

  // public boolean isAnagram(String s, String t) {
  //     // Idea 1 : Sort and compare (nlogn + n), space = 1;
  //     // Idea 2 : Count each character numbers and compare (n + n = order n ), space = n

  //     if (s.length() != t.length()) return false;

  //     Map<Character, Integer> map = new HashMap<>();

  //     for (char c : s.toCharArray()) {
  //         map.put(c,map.getOrDefault(c, 0) + 1);
  //     }

  //     for (char c : t.toCharArray()) {
  //         map.put(c,map.getOrDefault(c, 0) - 1);
  //     }

  //     for (char key : map.keySet()) {
  //         if (map.get(key) != 0) return false;
  //     }

  //     return true;

  // }
}
