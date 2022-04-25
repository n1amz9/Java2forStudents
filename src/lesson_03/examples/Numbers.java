package lesson_03.examples;

public class Numbers implements Comparable<Numbers>{

    private final int value;

    public Numbers(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Numbers o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "value=" + value +
                '}';
    }


}
