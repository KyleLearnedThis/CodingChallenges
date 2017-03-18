package com.albion.text.isomorphic;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/isomorphic-strings
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1) {
            return true;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                Character key = map.get(a);
                if(key.equals(b)){
                    continue;
                }
                else {
                    return false;
                }
            }else{
                if(!map.containsValue(b)) {
                    map.put(a, b);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
