package lab2;

public class Algorithm {

    public static void find3Numbers(int[] array, int arraySize, int sum) {
        for (int i = 0; i < arraySize - 2; i++) {

            for (int j = i + 1; j < arraySize - 1; j++) {

                for (int k = j + 1; k < arraySize; k++) {

                    if (array[i] + array[j] + array[k] == sum) {
                        System.out.print("( " + array[i] + ", " + array[j] + ", " + array[k] + " )\n");
                        return;
                    }
                }
            }
        }
    }


}
