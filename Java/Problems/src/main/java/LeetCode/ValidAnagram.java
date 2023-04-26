package LeetCode;

import java.util.HashMap;
import java.util.Objects;

//https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    //Use two map O(n) = O(s + t)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if(s.equals(t)) return true;

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            mapS.merge(s.charAt(i), 1, Integer::sum);
            mapT.merge(t.charAt(i), 1, Integer::sum);
        }

        for (char j : t.toCharArray()) {
            if (mapS.get(j) == null || !mapS.get(j).equals(mapT.get(j))) return false;
        }

        return true;
    }
}
