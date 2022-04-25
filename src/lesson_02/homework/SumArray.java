package lesson_02.homework;

public class SumArray {
    private String[][] array = null;

    SumArray(String[][] array) {
        this.array = array;
    }

    public int finalSum() throws MyArraySizeException, MyArrayDataException {
            int value = 0;
            if (array.length != 4 && array[0].length != 4) {
                throw new MyArraySizeException();
            } else {
                for (int i = 0; i < this.array.length; i++) {
                    for (int j = 0; j < this.array.length; j++) {
                        try {
                            value += Integer.parseInt(this.array[i][j]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException(i, j, array[i][j]);
                        }
                    }
                }
                return value;
            }
        }
    }


