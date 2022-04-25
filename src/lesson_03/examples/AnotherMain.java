package lesson_03.examples;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class AnotherMain {

    public static void main(String[] args) {
        Person person1 = new Person("Vasiliy", "Knyazev", 30);
        Person person2 = new Person("Eugene", "Petrov", 32);
        Person person3 = new Person("Elena", "Sidorova", 22);

        Numbers number1 = new Numbers(5);
        Numbers number2 = new Numbers(4);
        Numbers number3 = new Numbers(-5);
        Numbers number4 = new Numbers(8);


        Set<Person> personList = new TreeSet<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Set<Numbers> numbersList = new TreeSet<>();
        numbersList.add(number1);
        numbersList.add(number2);
        numbersList.add(number3);
        numbersList.add(number4);



        System.out.println(personList);

        System.out.println(numbersList);

    }

}
