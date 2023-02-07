package org.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses_929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmailSet = new HashSet<>();

        for(String email : emails) {
            int atIndex = email.indexOf("@");
            int plusIndex = email.indexOf("+");
            String local;
            String domain = email.substring(atIndex);
            if(plusIndex > 0 && plusIndex < atIndex) {
                local = email.substring(0,plusIndex).replace(".","");
            } else {
                local = email.substring(0,atIndex).replace(".","");
            }
            uniqueEmailSet.add(local + domain);
        }
        return uniqueEmailSet.size();
    }

//    //Original Solution
//    public int numUniqueEmails(String[] emails) {
//        Set<String> uniqueEmailSet = new HashSet<>();
//
//        for(String email : emails) {
//            String local = email.split("@")[0];
//            String domain = email.split("@")[1];
//            String localFilterByPlus = local.split("\\+")[0];
//            String localFilterByDot = localFilterByPlus.replace(".","");
//            String keyEmail = localFilterByDot + "@" + domain;
//            uniqueEmailSet.add(keyEmail);
//        }
//        return uniqueEmailSet.size();
//    }
}
