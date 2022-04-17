package lesson_01.homework;

public interface Members {

    int maxHeight = 0;
    int maxLength = 0;
    String name = "";
    int age = 0;




    default int getMaxHeight() {
        return maxHeight;
    }

    default int getMaxLength() {
        return maxLength;
    }

    default String getName() {
        return name;
    }

    default void run () {
        System.out.println(this.name + " побежал");
    }

    default void jump () {
        System.out.println(this.name + " прыгнул");
    }


}
