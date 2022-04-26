package lesson_03.homework;

public class mainClass {


    public static void main(String[] args) {
        PhoneBook.add("Nikolay", "89263332244");
        PhoneBook.add("Michael", "89622432244");
        PhoneBook.add("Eugene", "89222422244");
        PhoneBook.add("Nikita", "89263123244");
        PhoneBook.add("Eugene", "89263222244");
        PhoneBook.add("Eugene", "89263232244");
        PhoneBook.add("Eugene", "89263232244");


        PhoneBook.newAdd("Petrov", "8988282888");
        PhoneBook.newAdd("Petrov", "898234888");
        PhoneBook.newAdd("Petrovichev", "89832244888");
        PhoneBook.newAdd("Titov", "89882123888");
        PhoneBook.newAdd("Golovin", "89832122888");

        PhoneBook.get("Eugene");
        System.out.printf("Пользователь с такой фамилией имеет следующие номер(а) %s %n", PhoneBook.newGet("Petrov"));


    }
}
