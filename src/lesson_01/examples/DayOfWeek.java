package lesson_01.examples;

public enum DayOfWeek {

    JANUARY("Январь"),
    FEBRUARY("Январь"),
    MARCH("Январь"),
    APRIL("Январь"),
    MAY("Январь");

    private String russianMonthName;

    DayOfWeek(String russianMonthName) {
        this.russianMonthName = russianMonthName;
    }

    String DayOfWeek(String russianMonthName) {
        return russianMonthName;
    }

}
