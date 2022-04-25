package lesson_03.examples;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> stringsArrayList = new ArrayList<>();  // содержит внутри себя массив, который увеличивается на 50% при превышении количества.
        List<String> stringsLinkedList = new LinkedList<>();

        String[] newStringArray = new String[]{"String1", "String2", "String3"};
        List<Integer> integerList = new ArrayList<>();

        stringsArrayList.add("first");
        stringsArrayList.add("second");
        stringsArrayList.add("third");
        stringsArrayList.add("fourth");
        stringsArrayList.add("fifth");

        integerList.add(1);
        integerList.add(5);
        integerList.add(2);
        integerList.add(3);


        stringsArrayList.remove("fifth");
        stringsArrayList.remove(1);

        System.out.println(stringsArrayList.size());

        for (String s : stringsArrayList) {
            System.out.printf("Текущий элемент это %s %n", s);
        }

        if (!stringsArrayList.isEmpty())
        {
            System.out.println("коллекция не пустая");
        }

        System.out.println(integerList);


    }
}
