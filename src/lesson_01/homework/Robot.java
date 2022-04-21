package lesson_01.homework;

public class Robot implements Members{

    boolean isIncluded = true;
    private final String name;
    private final int age;
    private int maxHeight = 50;
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

    public void run () {
        System.out.println(this.name + " побежал");
    }

    public void jump () {
        System.out.println(this.name + " прыгнул");
    }
}
