package lesson_03.homework;

import java.util.*;

public class PhoneBook {

    public static String surname;
    public static String phoneNumber;
    public static Map<String, String> phoneDB = new HashMap<>();  // №1 вариант
    public static Map<String, Set<String>> newPhoneDB = new TreeMap<>();  // №2 вариант

    //1 вариант. Самописный
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
    public static Set<String> newAllSurnames() {
        return newPhoneDB.keySet();
    }
    public static Set<String> allSurnames() {
        return phoneDB.keySet();
    }

    //2 вариант. Разбор дз в 4 уроке

    public static void newAdd(String surname, String phoneNumber) {
        Set<String> phones = newPhoneDB.get(surname);
        if (phones == null) {
            Set<String> phonesSet= new HashSet<>();
            phonesSet.add(phoneNumber);
            newPhoneDB.put(surname,phonesSet);
        } else {
            phones.add(phoneNumber);
            newPhoneDB.put(surname, phones);
        }
    }

    public static Set<String> newGet (String surname) {
        return newPhoneDB.get(surname);
    }
}