package lab2;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array1 = {-1, 2, -10, -2, 0, 9, 4, 10};
        int[] array2 = {1, 2, 3, 4, 5};

        Algorithm.find3Numbers(array, array.length, 12);
        Algorithm.find3Numbers(array1, array1.length, -2);
        Algorithm.find3Numbers(array2, array2.length, 6);
    }
}
