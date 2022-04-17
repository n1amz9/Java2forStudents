package lesson_01.homework;

public class TestMain {
    public static void main(String[] args) {
        Cat[] cats = new Cat[2];
        Robot[] robots = new Robot[2];
        Human[] humans = new Human[2];

        Treadmill[] treadmills = new Treadmill[1];
        Wall[] walls = new Wall[1];

        cats[0] = new Cat("Барсик", 4);
        cats[1] = new Cat("Карасик", 3);
        robots[0] = new Robot("C-3PO", 30);
        robots[1] = new Robot("R2D2", 20);
        humans[0] = new Human("Аркадий", 20);
        humans[1] = new Human("Виталя", 34);
        treadmills[0] = new Treadmill("Дорожка №1",20);
        walls[0] = new Wall("Стена №1", 10);

        System.out.println(treadmills[0].isRanAcross(robots[1]));
        System.out.println(walls[0].isRanAcross(cats[1]));


//        for (int i = 0; i < 2; i++) {
//            robots[i].run();
//            cats[i].run();
//            humans[i].run();
//        }
    }
}
