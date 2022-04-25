package lesson_02.homework;

public class MyArraySizeException extends RuntimeException{

    MyArraySizeException() {
        super("Неправильный размер массива. На вход принимается только массив 4х4");
    }

}
