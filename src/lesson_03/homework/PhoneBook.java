package lesson_03.homework;

import java.util.*;

public class PhoneBook {

    public static String surname;
    public static String phoneNumber;
    public static Map<String, String> phoneDB = new HashMap<>();

    public static void add(String surname, String phoneNumber) {
        if (phoneDB.containsKey(phoneNumber)) {
            System.out.printf("Введенный вами номер %s уже есть в справочнике! %n", phoneNumber);
        } else {
            phoneDB.put(phoneNumber, surname);
        }

    }

    public static void get(String surname) {
        System.out.println("По вашему запросу найдены следующие номера");
        for (Map.Entry<String, String> o : phoneDB.entrySet()) {
            if (o.getValue().equals(surname)) {
                /*System.out.println(o.getKey() + ": " + o.getValue());*/
                System.out.printf("Фамилия: %s Номер: %s %n", o.getValue(), o.getKey());
            }
        }
    }



}
