package lesson_03.examples;

import java.util.*;

public class SetExample {
    protected static List<String> stringsArrayList = new ArrayList<>();  // содержит внутри себя массив, который увеличивается на 50% при превышении количества.
    protected static Set<Integer> integerList = new LinkedHashSet<>();


    private static void SetTheLists(){
        stringsArrayList.add("first");
        stringsArrayList.add("second");
        stringsArrayList.add("third");
        stringsArrayList.add("fourth");
        stringsArrayList.add("fifth");

        integerList.add(1);
        integerList.add(5);
        integerList.add(2);
        integerList.add(3);
        integerList.add(1);

        System.out.println(stringsArrayList);
        System.out.println(integerList);
    }
}
