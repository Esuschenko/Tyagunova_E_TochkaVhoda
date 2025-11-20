package academy.tochkavhoda.base;
import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberOperations {

    public static Integer find(int[] array, int value) {
        if (array == null) return null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return null;
    }

    public static Integer find(double[] array, double value, double eps) {
        if (array == null) return null;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - value) <= eps) return i;
        }
        return null;
    }

    public static Double calculateDensity(double weight, double volume, double min, double max) {
        if (volume == 0) return null;
        double density = weight / volume;
        return (density >= min && density <= max) ? density : null;
    }

    public static Integer find(BigInteger[] array, BigInteger value) {
        if (array == null || value == null) return null;
        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) return i;
        }
        return null;
    }

    public static BigDecimal calculateDensity(BigDecimal weight, BigDecimal volume, BigDecimal min, BigDecimal max) {
        if (weight == null || volume == null || volume.signum() == 0) return null;
        BigDecimal density = weight.divide(volume, 10, BigDecimal.ROUND_HALF_UP);
        density = density.stripTrailingZeros();  // ← вот эта строчка убирает лишние нули!
        if (density.compareTo(min) >= 0 && density.compareTo(max) <= 0) {
            return density;
        }
        return null;
    }
}