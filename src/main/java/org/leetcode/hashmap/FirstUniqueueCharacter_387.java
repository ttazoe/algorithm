package org.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueueCharacter_387 {
    public int firstUniqChar(String s) {
        Map<Character,Integer> charIndexMap = new HashMap<>();
        final int DUPLICATE_INDEX = Integer.MAX_VALUE;
        int ans = DUPLICATE_INDEX;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!charIndexMap.containsKey(c)) {
                charIndexMap.put(Character.valueOf(c),Integer.valueOf(i));
            } else {
                charIndexMap.put(Character.valueOf(c),Integer.valueOf(DUPLICATE_INDEX));
            }
        }

        for(Character key : charIndexMap.keySet()){
            int index = charIndexMap.get(key);
            ans = Math.min(ans, index);
        }

        if(ans == DUPLICATE_INDEX) {
            ans = -1;
        }
        return ans;
    }
}
