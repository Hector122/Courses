import java.util.ArrayList
import java.util.Arrays

//https://leetcode.com/problems/group-anagrams/
class GroupsOfAnagram {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val listOfAnagram = ArrayList<List<String>>() // list of lists to store anagrams
        val hashMap = hashMapOf<String, MutableList<String>>() // hashmap to store anagrams

        for (word in strs) { // loop through the array of words
            val hash = CharArray(26) // initialize a character array to count the number of characters in the word
            for (c in word) { // count the number of characters by iterating over the characters in the word
                hash[c - 'a']++ // increment the count for the corresponding character
            }

            val key = hash.contentToString() // generate a unique key for the anagram by converting the character count array to a string
            if (!hashMap.containsKey(key)) { // if the key is not present in the hashmap, add a new key-value pair with an empty list
                hashMap[key] = mutableListOf()
            }

            hashMap[key]?.add(word) // add the word to the list of anagrams for the corresponding key
        }

        listOfAnagram.addAll(hashMap.values) // add all the lists of anagrams to the list of lists
        return listOfAnagram // return the final list of anagrams
    }

}