package lesson_01.homework;

public class Cat implements Members{

    private final String name;
    private final int age;
    private final int maxHeight = 100;
    private final int maxLength = 200;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxLength() {
        return maxLength;
    }

    protected void run () {
        System.out.println(this.name + " побежал");
    }

    protected void jump () {
        System.out.println(this.name + " прыгнул");
    }

}
