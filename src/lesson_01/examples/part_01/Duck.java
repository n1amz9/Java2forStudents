package lesson_01.examples.part_01;

import lesson_01.examples.Animal;
import lesson_01.examples.Waterfowl;

public class Duck extends Animal implements Waterfowl {

    public Duck(int age) {
        super(age);
    }

    @Override
    public CharSequence String() {
        return Waterfowl.super.String();
    }
}
