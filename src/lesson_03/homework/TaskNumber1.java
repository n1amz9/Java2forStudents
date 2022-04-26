package lesson_03.homework;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class TaskNumber1 {

    public static void main(String[] args) {
        String[] stringArray = {"First", "Second", "Third", "Second", "First", "Japan", "Moskow" , "Japan" , "First"};
        Set<String> uniqueList = new HashSet<>(Arrays.asList(stringArray));
        List<String> newUniqueList = new ArrayList<>(uniqueList);

        System.out.println(Arrays.toString(stringArray));

        for (int i = 0; i < newUniqueList.size(); i++) {
            String word = newUniqueList.get(i);
            int value = 0;
            for (int j = 0; j < stringArray.length; j++) {
                if (stringArray[j].equals(word)) {
                    value++;
                }
            }
            System.out.printf("Слово %s встречается в данном массиве %d раз %n", word, value);
        }
    }
}


