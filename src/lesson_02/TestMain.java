package lesson_02;

public class TestMain {

    public static void main(String[] args) {
        someMethod();
        throw new ExceptionTest();
    }

    private static void someMethod() {
        int a = 1;
        int b = 10;
        try {
            System.out.println(b / a);
        } catch (ArithmeticException| NullPointerException exception) {
            exception.printStackTrace();
            System.out.print("ERROR:");
            System.out.print("[SERVER]");
            System.out.println(" " + exception);
            System.out.println("===");
            System.out.println("Произошо деление на ноль");
            System.out.println("===");
        }
    }
}
