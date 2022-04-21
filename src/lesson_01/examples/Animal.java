package lesson_01.examples;

public abstract class Animal {

    protected static String name;
    protected final int age;

    public Animal(int age) {
        this.age = age;
    }

    public static int voice() {
        return 5;
    }
}
