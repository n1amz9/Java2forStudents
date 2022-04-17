package lesson_01.homework;

public class Robot implements Members{

    private final String name;
    private final int age;
    private int maxHeight = 10;
    private int maxLength = 500;

    public Robot(String name, int age) {
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
