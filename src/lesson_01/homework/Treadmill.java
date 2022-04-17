package lesson_01.homework;

public class Treadmill implements Barriers{

    private String name;
    private int length;

    public Treadmill(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public Treadmill(int lenght) {
        this.length = lenght;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
