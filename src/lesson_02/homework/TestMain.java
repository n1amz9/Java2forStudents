package lesson_02.homework;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        String[][] input = new String[4][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                input[i][j] = scanner.next();
            }
        }

        SumArray sumArray = new SumArray(input);
        try {
            System.out.println("Сумма всех элементов равна = " + sumArray.finalSum());
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("ПРОИЗОШЛА ОШИБКА! " + e.getMessage());
        }
    }
}
