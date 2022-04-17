package lesson_01.homework;

public class Human implements Members {

    private String name;
    private int age;
    private int maxHeight = 60;
    private int maxLength = 300;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run () {
        System.out.println(this.name + " побежал");
    }

    public void jump () {
        System.out.println(this.name + " прыгнул");
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxLength() {
        return maxLength;
    }
}
