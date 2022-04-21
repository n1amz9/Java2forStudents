package lesson_02.homework;

public class MyArrayDataException extends RuntimeException{

    MyArrayDataException() {
        super("Ошибка преобразования типов. Требуется цифровое значение");
    }
    MyArrayDataException(int i, int j, String value) {
        super("Ошибка преобразования типов. Требуется цифровое значение. Неверное значение в ячейке [" + i + "] " + "[" + j + "] со значением " + value);
    }

}
