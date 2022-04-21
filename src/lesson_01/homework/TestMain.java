package lesson_01.homework;

public class TestMain {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        Robot[] robots = new Robot[3];
        Human[] humans = new Human[3];


        Treadmill[] treadmills = new Treadmill[3];
        Wall[] walls = new Wall[3];

        cats[0] = new Cat("Барсик", 4);
        cats[1] = new Cat("Карасик", 3);
        cats[2] = new Cat("Шлеппа", 100);
        robots[0] = new Robot("C-3PO", 30);
        robots[1] = new Robot("R2D2", 20);
        robots[2] = new Robot("Bob", 20);
        humans[0] = new Human("Аркадий", 20);
        humans[1] = new Human("Виталя", 34);
        humans[2] = new Human("Андрюша", 21);
        treadmills[0] = new Treadmill("Дорожка №1",100);
        treadmills[1] = new Treadmill("Дорожка №2",50);
        treadmills[2] = new Treadmill("Дорожка №3",100);
        walls[0] = new Wall("Стена №1", 100);
        walls[1] = new Wall("Стена №2", 200);
        walls[2] = new Wall("Стена №3", 300);


        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < treadmills.length; j++) {
                    treadmills[i].isRanAcross(cats[j]);
                    walls[i].isRanAcross(cats[j]);
                    treadmills[i].isRanAcross(robots[j]);
                    walls[i].isRanAcross(robots[j]);
                    treadmills[i].isRanAcross(humans[j]);
                    walls[i].isRanAcross(humans[j]);
            }
        }


    }
}
