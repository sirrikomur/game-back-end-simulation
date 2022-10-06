package utility;

import java.util.Arrays;

public class Mathematics {
    public static int getSmallNumber(int... numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static float getSmallNumber(float... numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static double getSmallNumber(double... numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static int getLargeNumber(int... numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static float getLargeNumber(float... numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static double getLargeNumber(double... numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }
}
