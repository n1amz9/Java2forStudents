package lesson_01.homework_fix.participant;

public class Robot implements Participant{

    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 1000;
    }

    @Override
    public int jump() {
        return 10;
    }
}
