package academy.tochkavhoda.introduction;

public class ZeroSteps2 {
    //возвращает сумму квадратов целых чисел от 1 до
    public int sumSquares(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * i;
        }
        return sum;
    }
    //возвращает сумму квадратов целых чисел от 1 до count
    public int sumOdds(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i += 2) {  //нечет
            sum += i;
        }
        return sum;
    }
    //возвращает сумму обратных величин целых чисел от 1 до count
    public double sumInverses(int count) {
        double sum = 0.0;
        for (int i = 1; i <= count; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
    //возвращает произведение целых чисел от 1 до count
    public long factorial(int count) {
        long result = 1;
        for (int i = 2; i <= count; i++) {
            result *= i;
        }
        return result;
    }
    //Возвращает произведение цифр целого числа
    public int prodDigits(int value) {
        if (value == 0) return 0;
        value = Math.abs(value);
        int prod = 1;
        while (value > 0) {
            prod *= value % 10;
            value /= 10;
        }
        return prod;
    }
    //возвращает число Фибоначчи номер number. Не использовать рекурсию.
    public int fibonacci(int number) {
        if (number <= 1) return number;
        int a = 0, b = 1;
        for (int i = 2; i <= number; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    //возвращает сумму всех степеней 2 от 2^0 до 2^max
    public long sum2Powers(int max) {
        long sum = 0;
        for (int i = 0; i <= max; i++) {
            sum += 1L << i;
        }
        return sum;
    }
    //Возвращает сумму квадратов целых чисел от 1 до count
    public int sumSquaresWithBarrier(int count, int barrier) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            int square = i * i;
            sum += square;
            if (sum > barrier) {
                break;
            }
        }
        return sum;
    }
    //возвращает сумму всех произведений
    public int sumPairProd(int count1, int count2) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += i * j;
            }
        }
        return sum;
    }
    //возвращает сумму тех произведений, которые меньше barrier
    public int sumPairProdWithBarrier(int count1, int count2, int barrier) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                int prod = i * j;
                if (prod >= barrier) continue;
                sum += prod;
            }
        }
        return sum;
    }
    //возвращает сумму всех величин
    public double sumInversePairProd(int count1, int count2) {
        double sum = 0.0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += 1.0 / (i * j);
            }
        }
        return sum;
    }
    //возвращает сумму всех произведений
    public int sumTripleProd(int count1, int count2, int count3) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                for (int k = 1; k <= count3; k++) {
                    sum += i * j * k;
                }
            }
        }
        return sum;
    }
    //возвращает значение числа e, суммирование вести до тех пор, пока очередной элемент не станет меньше 1E-6
    public double calculateE() {
        double e = 1.0;
        double term = 1.0;
        int n = 1;
        while (term >= 1e-6) {
            term /= n;
            e += term;
            n++;
        }
        return e;
    }
    //суммирование вести до тех пор, пока очередной элемент по абсолютной величине не станет меньше 1E-8
    public double calculatePi() {
        double sum = 0.0;
        double term = 1.0;
        int denominator = 1;
        int sign = 1;
        while (Math.abs(term) >= 1E-8) {
            sum += term;
            denominator += 2;
            sign *= -1;
            term = (double) sign / denominator;
        }
        return 4 * sum;
    }

    public double calculateCircleSquare(double length, int count) {
        double center = length / 2.0;
        double radius = center;
        int inside = 0;
        for (int i = 0; i < count; i++) {
            double x = Math.random() * length;
            double y = Math.random() * length;
            // расстояние от точки до центра
            double distance = Math.sqrt((x - center) * (x - center) + (y - center) * (y - center));
            if (distance <= radius) {
                inside++;
            }
        }
        return length * length * (double) inside / count;
    }
}

