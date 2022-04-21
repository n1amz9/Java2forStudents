package lesson_01.homework_fix.obstacles;

import lesson_01.homework_fix.participant.Participant;

public class Wall implements Obstacles{

    private final int height;

    public Wall(int length) {
        this.height = length;
    }

    @Override
    public boolean passObstacle(Participant participant) {
        if (height < participant.jump()) {
            System.out.printf("Участник %s успешно перепрыгнул через стену высотой %d %n", participant, height);
            return true;
        } else {
            System.out.printf("Участник %s не перепрыгнул стену высотой %d %n", participant, height);
            return false;
        }
    }
}
