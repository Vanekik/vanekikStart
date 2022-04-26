import java.util.Arrays;

public class StartMas {
    public static void main(String[] args) {

        double[] numbers = new double[]{5.5, 10.5, -10.0, -5.0, 100.1};

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > 0) {
                System.out.println(numbers[index]);
            }
            if (numbers[index] < 0) {
                numbers[index] *= 5.0;
            }
        }

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
