package lesson_01.examples;

public interface Waterfowl {

    public default CharSequence String() {
        return "This is Duck";
    }
}
