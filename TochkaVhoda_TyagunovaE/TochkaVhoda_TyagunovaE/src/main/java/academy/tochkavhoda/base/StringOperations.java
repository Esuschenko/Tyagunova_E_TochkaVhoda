package academy.tochkavhoda.base;

import java.util.StringJoiner;

public class StringOperations {

    // 1. Возвращает суммарную длину всех строк в массиве (null-элементы игнорируются)
    public static int getSummaryLength(String[] strings) {
        if (strings == null) return 0;
        int sum = 0;
        for (String s : strings) {
            if (s != null) sum += s.length();
        }
        return sum;
    }

    // 2. Возвращает строку из первого и последнего символа входной строки
    public static String getFirstAndLastLetterString(String string) {
        if (string == null || string.isEmpty()) return "";
        char first = string.charAt(0);
        char last = string.charAt(string.length() - 1);
        return "" + first + last;
    }

    // 3. Сравнивает символы в заданной позиции двух строк
    public static boolean isSameCharAtPosition(String string1, String string2, int index) {
        if (string1 == null || string2 == null) return false;
        if (index < 0 || index >= string1.length() || index >= string2.length()) return false;
        return string1.charAt(index) == string2.charAt(index);
    }

    // 4. Проверяет, находится ли первое вхождение символа в одинаковой позиции (с начала)
    public static boolean isSameFirstCharPosition(String string1, String string2, char character) {
        return string1.indexOf(character) == string2.indexOf(character);
    }

    // 5. Проверяет, находится ли последнее вхождение символа в одинаковой позиции (с конца)
    public static boolean isSameLastCharPosition(String string1, String string2, char character) {
        return string1.lastIndexOf(character) == string2.lastIndexOf(character);
    }

    // 6. Проверяет, начинается ли первое вхождение подстроки в одинаковой позиции (с начала)
    public static boolean isSameFirstStringPosition(String string1, String string2, String str) {
        return string1.indexOf(str) == string2.indexOf(str);
    }

    // 7. Проверяет, начинается ли последнее вхождение подстроки в одинаковой позиции (с конца)
    public static boolean isSameLastStringPosition(String string1, String string2, String str) {
        return string1.lastIndexOf(str) == string2.lastIndexOf(str);
    }

    // 8. Сравнивает строки на точное равенство (с учётом null)
    public static boolean isEqual(String string1, String string2) {
        return string1 == null ? string2 == null : string1.equals(string2);
    }

    // 9. Сравнивает строки на равенство без учёта регистра
    public static boolean isEqualIgnoreCase(String string1, String string2) {
        return string1 == null ? string2 == null : string1.equalsIgnoreCase(string2);
    }

    // 10. Проверяет, что string1 лексикографически меньше string2
    public static boolean isLess(String string1, String string2) {
        return string1 == null ? string2 != null : string1.compareTo(string2) < 0;
    }

    // 11. Проверяет лексикографическое сравнение без учёта регистра
    public static boolean isLessIgnoreCase(String string1, String string2) {
        return string1 == null ? string2 != null : string1.compareToIgnoreCase(string2) < 0;
    }

    // 12. Конкатенирует две строки
    public static String concat(String string1, String string2) {
        return string1 + string2;
    }

    // 13. Проверяет, имеют ли строки одинаковый префикс
    public static boolean isSamePrefix(String string1, String string2, String prefix) {
        return string1.startsWith(prefix) && string2.startsWith(prefix);
    }

    // 14. Проверяет, имеют ли строки одинаковый суффикс
    public static boolean isSameSuffix(String string1, String string2, String suffix) {
        return string1.endsWith(suffix) && string2.endsWith(suffix);
    }

    // 15. Возвращает самый длинный общий префикс двух строк
    public static String getCommonPrefix(String string1, String string2) {
        if (string1 == null || string2 == null) return "";
        int minLen = Math.min(string1.length(), string2.length());
        int i = 0;
        while (i < minLen && string1.charAt(i) == string2.charAt(i)) i++;
        return string1.substring(0, i);
    }

    // 16. Возвращает перевёрнутую строку
    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    // 17. Проверяет, является ли строка палиндромом (с учётом регистра)
    public static boolean isPalindrome(String string) {
        return string.equals(reverse(string));
    }

    // 18. Проверяет, является ли строка палиндромом (без учёта регистра)
    public static boolean isPalindromeIgnoreCase(String string) {
        return string.equalsIgnoreCase(reverse(string));
    }

    // 19. Возвращает самый длинный палиндром из массива (без учёта регистра)
    public static String getLongestPalindromeIgnoreCase(String[] strings) {
        if (strings == null) return "";
        String longest = "";
        for (String s : strings) {
            if (s != null && isPalindromeIgnoreCase(s) && s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }

    // 20. Проверяет, совпадают ли подстроки заданной длины с указанного индекса
    public static boolean hasSameSubstring(String string1, String string2, int index, int length) {
        if (string1 == null || string2 == null) return false;
        if (index < 0 || index + length > string1.length() || index + length > string2.length()) return false;
        return string1.substring(index, index + length).equals(string2.substring(index, index + length));
    }

    // 21. Сравнивает строки после замены символов
    public static boolean isEqualAfterReplaceCharacters(String string1, char old1, char new1,
                                                        String string2, char old2, char new2) {
        return string1.replace(old1, new1).equals(string2.replace(old2, new2));
    }

    // 22. Сравнивает строки после замены подстрок
    public static boolean isEqualAfterReplaceStrings(String string1, String old1, String new1,
                                                     String string2, String old2, String new2) {
        return string1.replace(old1, new1).equals(string2.replace(old2, new2));
    }

    // 23. Проверяет, является ли строка палиндромом после удаления пробелов (без учёта регистра)
    public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string) {
        String cleaned = string.replaceAll("\\s", "").toLowerCase();
        return cleaned.equals(reverse(cleaned));
    }

    // 24. Сравнивает строки после удаления пробелов в начале и конце
    public static boolean isEqualAfterTrimming(String string1, String string2) {
        return string1.trim().equals(string2.trim());
    }

    // 25. Формирует CSV-строку из массива целых чисел
    public static String makeCsvStringFromInts(int[] array) {
        if (array == null || array.length == 0) return "";
        StringJoiner joiner = new StringJoiner(",");
        for (int n : array) joiner.add(String.valueOf(n));
        return joiner.toString();
    }

    // 26. Формирует CSV-строку из массива вещественных чисел (2 знака после запятой)
    public static String makeCsvStringFromDoubles(double[] array) {
        if (array == null || array.length == 0) return "";
        StringJoiner joiner = new StringJoiner(",");
        for (double n : array) joiner.add(String.format("%.2f", n));
        return joiner.toString();
    }

    // 27. То же, что 25, но возвращает StringBuilder
    public static StringBuilder makeCsvStringBuilderFromInts(int[] array) {
        StringBuilder sb = new StringBuilder();
        if (array == null || array.length == 0) return sb;
        for (int i = 0; i < array.length; i++) {
            if (i > 0) sb.append(',');
            sb.append(array[i]);
        }
        return sb;
    }

    // 28. То же, что 26, но возвращает StringBuilder
    public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array) {
        StringBuilder sb = new StringBuilder();
        if (array == null || array.length == 0) return sb;
        for (int i = 0; i < array.length; i++) {
            if (i > 0) sb.append(',');
            sb.append(String.format("%.2f", array[i]));
        }
        return sb;
    }

    // 29. Удаляет символы по заданным позициям (позиции для исходной строки)
    public static StringBuilder removeCharacters(String string, int[] positions) {
        if (string == null || positions == null || positions.length == 0) return new StringBuilder(string == null ? "" : string);
        StringBuilder sb = new StringBuilder(string);
        int offset = 0;
        for (int pos : positions) {
            sb.deleteCharAt(pos - offset);
            offset++;
        }
        return sb;
    }

    // 30. Вставляет символы в заданные позиции (позиции для исходной строки)
    public static StringBuilder insertCharacters(String string, int[] positions, char[] characters) {
        if (string == null) return new StringBuilder();
        if (positions == null || characters == null || positions.length != characters.length) return new StringBuilder(string);
        StringBuilder sb = new StringBuilder(string);
        int offset = 0;
        for (int i = 0; i < positions.length; i++) {
            sb.insert(positions[i] + offset, characters[i]);
            offset++;
        }
        return sb;
    }
}