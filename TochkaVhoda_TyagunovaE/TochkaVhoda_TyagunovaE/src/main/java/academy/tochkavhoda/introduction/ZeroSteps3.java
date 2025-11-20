package academy.tochkavhoda.introduction;

public class ZeroSteps3 {
    //сумма чисел, заданных одномерным массивом
    public int sum(int[] array){
        if (array == null || array.length == 0) return 0;
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }
    //возвращает произведение чисел, заданных одномерным массивом
    public int mul(int[] array){
        if (array == null || array.length == 0) return 0;
        int product = 1;
        for (int value : array) {
            product *= value;
        }
        return product;
    }

    //возвращает минимальное из чисел, заданных одномерным массивом
    public int min(int[] array){
        if (array == null || array.length == 0) return Integer.MAX_VALUE;
        int minVal = array[0];
        for (int value : array) {
            if (value < minVal) minVal = value;
        }
        return minVal;
    }
    //возвращает максимальное из чисел, заданных одномерным массивом
    public int max(int[] array){
        if (array == null || array.length == 0) return Integer.MIN_VALUE;
        int maxVal = array[0];
        for (int value : array) {
            if (value > maxVal) maxVal = value;
        }
        return maxVal;
    }
    //возвращает среднее значение для чисел, заданных одномерным массивом array
    public double average(int[] array){
        if (array == null || array.length == 0) return 0.0;
        return (double) sum(array) / array.length;
    }
    //возвращает true, если одномерный массив, упорядочен по убыванию
    public boolean isSortedDescendant(int[] array){
        if (array == null || array.length <= 1) return true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) return false;
        }
        return true;
    }
    //возводит все элементы массива в куб
    public void cube(int[]array){
            if (array == null) return;
            for (int i = 0; i < array.length; i++) {
                int value = array[i];
                array[i] = value * value * value;
            }
        }

    //возвращает true, если в одномерном массиве array имеется элемент, равный value
    public boolean find(int[]array, int value){
        if (array == null) return false;
        for (int num : array) {
            if (num == value) return true;
        }
        return false;
    }

    //переворачивает одномерный массив
    public void reverse(int[]array){
        if (array == null || array.length <= 1) return;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
    //возвращает true, если одномерный массив является палиндромом
    public boolean isPalindrome(int[]array){
        if (array == null || array.length <= 1) return true;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) return false;
            left++;
            right--;
        }
        return true;
    }
    //заменяет элементы массива на их квадраты, пока не встретится нулевой элемент
    public void replaceBySquare(int[] array){
        if (array == null) return;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) break;
            array[i] = array[i] * array[i];
        }
    }
    //возвращает произведение ненулевых чисел, заданных одномерным массивом
    public int mulNonZero(int[] array){
        if (array == null || array.length == 0) return 0;
        int product = 1;
        boolean hasNonZero = false;
        for (int value : array) {
            if (value != 0) {
                product *= value;
                hasNonZero = true;
            }
        }
        return hasNonZero ? product : 0;
    }

    //возвращает true, если все элементы массива положительные
    public boolean allPositive(int[] array){
        if (array == null || array.length == 0) return false;
        for (int value : array) {
            if (value <= 0) return false;
        }
        return true;
    }
    //возвращает true, если все элементы массива равны между собой
    public boolean allEqual(int[] array) {
        if (array == null || array.length <= 1) return true;
        int first = array[0];
        for (int value : array) {
            if (value != first) return false;
        }
        return true;
    }

    //возвращает индекс первого элемента, который больше своих соседей
    public int greaterThanNeighbours(int[] array){
        if (array == null || array.length < 3) return -1;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }
    //определяет, есть ли среди элементов массива array такой элемент, который равен полусумме своих соседей
    public boolean neighboursAverage(double[] array){
        if (array == null || array.length < 3) return false;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == (array[i - 1] + array[i + 1]) / 2.0) {
                return true;
            }
        }
        return false;
    }
    //в массиве array есть ровно 2 нулевых элемента
    public int sumBetween2Zeros(int[] array){
        if (array == null) return 0;
        int firstZero = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (firstZero == -1) {
                    firstZero = i;
                } else {
                    int sum = 0;
                    for (int j = firstZero + 1; j < i; j++) {
                        sum += array[j];
                    }
                    return sum;
                }
            }
        }
        return 0;
    }
    //возвращает количество элементов, для которых совпадают значения в одной и той же позиции в обоих массивах
    public int sameAtPosition(int[] array1, int[]array2){
        if (array1 == null || array2 == null) return 0;
        int minLen = Math.min(array1.length, array2.length);
        int count = 0;
        for (int i = 0; i < minLen; i++) {
            if (array1[i] == array2[i]) count++;
        }
        return count;
    }
    //возвращает true, если есть хотя бы одна позиция в массивах, для которой элементы в обоих массивах нулевые
    public boolean bothZeroAtPosition(int[] array1, int[]array2){
        if (array1 == null || array2 == null) return false;
        int minLen = Math.min(array1.length, array2.length);
        for (int i = 0; i < minLen; i++) {
            if (array1[i] == 0 && array2[i] == 0) return true;
        }
        return false;
    }


    public void accumulatedSum(int[] array) {
        if (array == null || array.length <= 1) return;  // ничего не делаем
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i] + array[i - 1];  // прибавляем предыдущее
        }
    }

    public int[] mergeArrays(int[] array1, int[] array2){
        int[] result = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }
        while (i < array1.length) result[k++] = array1[i++];
        while (j < array2.length) result[k++] = array2[j++];
        return result;
    }


    public int insideCircle(int[] x, int[] y,int radius){
        if (x == null || y == null || x.length != y.length) return 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            long distSquared = (long) x[i] * x[i] + (long) y[i] * y[i];
            if (distSquared <= (long) radius * radius) {
                count++;
            }
        }
        return count;
    }

    public double scalarProduct(double[] array1, double[] array2){
        if (array1 == null || array2 == null || array1.length != array2.length) return 0.0;
        double product = 0.0;
        for (int i = 0; i < array1.length; i++) {
            product += array1[i] * array2[i];
        }
        return product;
    }
}



