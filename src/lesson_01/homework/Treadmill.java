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

    public boolean isRanAcross(Members members) {
        members.run();
        if (members.getMaxLength() >= length)  {
            System.out.println("Участник перебежал "  + this.name + " длиной " + length);
            return true;
        }
        else {
            System.out.println("Участник не перебежал " + this.name + " длиной " + length);
            return false;
        }
    }
}
