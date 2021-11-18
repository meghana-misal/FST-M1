package activities.activity4;
import java.util.Arrays;

class Activity4 {
    public static void main(String[] args) {
        int[] numbers = { 20, 10, 4, 7, 2 };
        int size = numbers.length, i;

        for (i = 1; i < size; i++) {
            int value = numbers[i];
            int j = i - 1;

            while (j >= 0 && value < numbers[j]) {
                numbers[j + 1] = numbers[j];
                --j;
            }
            numbers[j + 1] = value;
        }
        System.out.println("Ascending Order array: ");
        System.out.println(Arrays.toString(numbers));

    }
}