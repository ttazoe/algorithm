package org.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numsHashSet = new HashSet<>();
        Set<Integer> duplicateNumsHashSet = new HashSet<>();

        for(int num : nums1) {
            numsHashSet.add(num);
        }
        for(int num : nums2){
            // TODO : numHashSet.remove() を使うことで、比較対象から除くことができる。
            // Dupliacate 側で Set を使わなくてよい。
            if (numsHashSet.contains(num)){
                duplicateNumsHashSet.add(num);
            }
        }

        int[] duplicateIntList = new int[duplicateNumsHashSet.size()];

        int index = 0;
        for(Integer num : duplicateNumsHashSet) {
            duplicateIntList[index] = num.intValue();
            index++;
        }
        return duplicateIntList;
    }
}
