package lesson_03.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PersonHashExample {

    public static void main(String[] args) {
        Person person1 = new Person("Vasiliy", "Knyazev", 30);
        Person person2 = new Person("Eugene", "Petrov", 32);
        Person person3 = new Person("Elena", "Sidorova", 22);
        Person person4 = new Person("Elena", "Sidorova", 22);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person4.hashCode());

        Set<Person> personList = new HashSet<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);


        System.out.println(personList);


    }
}
