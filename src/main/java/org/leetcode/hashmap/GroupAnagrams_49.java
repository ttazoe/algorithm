package org.leetcode.hashmap;

import java.util.*;

// 

public class GroupAnagrams_49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> patternMap = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(patternMap.containsKey(key)) {
                patternMap.get(key).add(str);
            } else {
                List<String> newPattern = new ArrayList<>();
                newPattern.add(str);
                patternMap.put(key, newPattern);
            }
        }
        return new ArrayList<>(patternMap.values());
    }


//    First solution
//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> ans = new ArrayList<>();
//        Map<Map<Character,Integer>,Integer> mapListIndexMap = new HashMap<>();
//        int patternIndex = 0;
//
//        for(String str : strs) {
//            Map<Character, Integer> charCountHash = new HashMap<>();
//            for(int i = 0; i < str.length(); i++) {
//                char c = str.charAt(i);
//                if(charCountHash.containsKey(c)) {
//                    int count = charCountHash.get(c);
//                    count++;
//                    charCountHash.put(c, count);
//                } else {
//                    charCountHash.put(c,1);
//                }
//            }
//
//            if(mapListIndexMap.containsKey(charCountHash)) {
//                ans.get(mapListIndexMap.get(charCountHash)).add(str);
//            } else {
//                List<String> newPattern = new ArrayList<>();
//                newPattern.add(str);
//                ans.add(newPattern);
//                mapListIndexMap.put(charCountHash, patternIndex);
//                patternIndex++;
//            }
//        }
//
//        return ans;
//    }
}
