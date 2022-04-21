package lesson_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("textFile.txt");){
            byte[] bytes = fileInputStream.readAllBytes();
            String string = new String(bytes);
            System.out.println((Arrays.toString(bytes)));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Блок Finally");
        }
        System.out.println("Программа завершила свою работу");

    }
}
