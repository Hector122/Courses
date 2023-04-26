package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/group-anagrams/
public class GroupsOfAnagram {


    /***
     *  Using sorting
     *  this algorithm has a time complexity of O(n * k * log(k)), where n is the number of strings
     *  in strs and k is the length of the longest string. The dominant operation is sorting each string,
     *  which takes O(k * log(k)) time.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> listOfAnagram = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] characters = word.toCharArray();

            // sort the array
            Arrays.sort(characters);
            String sorted = new String(characters);

            if (!map.containsKey(sorted)) {
                //add to map
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(word);
        }

        // add all map values.
        listOfAnagram.addAll(map.values());
        return listOfAnagram;
    }

    /***
     * This algorithm has a time complexity of O(n * k), where n is the number of strings in strs and k is
     * the length of the longest string. The dominant operation is iterating over each character in each string,
     * which takes O(k) time.
     */
    public List<List<String>> groupAnagramsTwo(String[] strs) {
        List<List<String>> listOfAnagram = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            int[] hash = new int [26];

            for(char c : word.toCharArray()){
                hash[c - 'a' ]++;
            }

            //Generate key as String
            String key = Arrays.toString(hash);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        listOfAnagram.addAll(map.values());
        return listOfAnagram;
    }
}


















