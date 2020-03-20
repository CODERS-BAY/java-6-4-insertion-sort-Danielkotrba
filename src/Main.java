import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {7, 87, 9, 51, -8, 64};
        System.out.println(Arrays.toString(numbers));

        array(numbers);

    }

    private static void array(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int unsorted = numbers[i];
            int temp = i - 1;

            while (temp >= 0 && numbers[temp] > unsorted) {
                numbers[temp + 1] = numbers[temp];
                temp = temp - 1;
            }
            numbers[temp + 1] = unsorted;
            System.out.println(Arrays.toString(numbers));
        }

    }
}
