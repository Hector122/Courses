package LeetCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupsOfAnagramTest {

    @Test
    @DisplayName("GroupOfAnagram")
    void testGroupOfAnagram_ShouldBeEqual(){
        String[] input = {"eat","tea","tan","ate","nat","bat"};

        // [["bat"],["nat","tan"],["ate","eat","tea"]]
        List<List<String>> expected = new ArrayList<>();
        List<String> listOne = new ArrayList<>();
        listOne.add("bat");
        List<String>  listTwo = new ArrayList<>();
        listTwo.add("tan");
        listTwo.add("nat");

        List<String>  listThree = new ArrayList<>();
        listThree.add("eat");
        listThree.add("tea");
        listThree.add("ate");

        expected.add(listThree);
        expected.add(listOne);
        expected.add(listTwo);

        GroupsOfAnagram groupsOfAnagram = new GroupsOfAnagram();
        assertEquals(expected, groupsOfAnagram.groupAnagrams(input));
        assertEquals(expected, groupsOfAnagram.groupAnagramsTwo(input));
    }

}