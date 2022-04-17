package lesson_01.homework;

public class Wall implements Barriers{

    private String name;
    private int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isRanAcross(Members members) {
        if (members.getMaxHeight() >= height)  {
            System.out.println("Участник перепрыгнул " + this.name + " высотой " + height);
            return true;
        }
        else {
            System.out.println("Участник не перепрыгнул " + this.name + ", высотой " + height);
            return false;
        }
    }


}
