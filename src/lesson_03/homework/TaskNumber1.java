package lesson_03.homework;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class TaskNumber1 {

    public static void main(String[] args) {
        /*1 вариант. Изначально думал, что требуется просто вывести какой либо вывод. Оказалось, нужно вывести в формате коллекции*/

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

        /*2 вариант. Разбор дз в уроке 4*/

        Map<String, Integer> frequencyByWord = new HashMap<>();

        for (String word : stringArray) {
            Integer frequency = frequencyByWord.get(word);

            if(frequency == null) {
                frequency = 0;
            }
            frequencyByWord.put(word, ++frequency);
            }

        System.out.println(frequencyByWord);
    }

}


