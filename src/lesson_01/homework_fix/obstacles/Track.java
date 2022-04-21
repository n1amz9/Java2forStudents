package lesson_01.homework_fix.obstacles;

import lesson_01.homework_fix.participant.Participant;

public class Track implements Obstacles{

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacle(Participant participant) {
        if (length < participant.run()) {
            System.out.printf("Участник %s успешно перебежал трек длиной высотой %d %n", participant, length);
            return true;
        } else {
            System.out.printf("Участник %s не перебежал трек длиной %d %n", participant, length);
            return false;
        }
    }
}
