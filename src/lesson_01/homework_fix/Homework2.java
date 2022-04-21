package lesson_01.homework_fix;

import lesson_01.homework_fix.obstacles.Obstacles;
import lesson_01.homework_fix.obstacles.Track;
import lesson_01.homework_fix.obstacles.Wall;
import lesson_01.homework_fix.participant.Cat;
import lesson_01.homework_fix.participant.Human;
import lesson_01.homework_fix.participant.Participant;
import lesson_01.homework_fix.participant.Robot;

public class Homework2 {
    public static void main(String[] args) {
        Human human = new Human("Владимир");
        Robot robot = new Robot("С3P0");
        Cat cat = new Cat("Барсик");

        Track track = new Track(150);
        Wall wall = new Wall(15);

        Participant[] participants = {human,robot,cat};
        Obstacles[] obstacles = {track, wall};

        for (Participant participant : participants) {
            for (Obstacles obstacle : obstacles) {
                if (!obstacle.passObstacle(participant)) {
                    System.out.printf("Участник %s ВЫБЫВАЕТ из соревнований %n", participant);
                    break;
                } else {
                    obstacle.passObstacle(participant);
                }
            }
        }
        }
    }

