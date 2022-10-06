package utility;

import java.util.Arrays;

public class Mathematics {
    public int getSmallNumber(int... numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public float getSmallNumber(float... numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public double getSmallNumber(double... numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public int getLargeNumber(int... numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public float getLargeNumber(float... numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public double getLargeNumber(double... numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }
}
