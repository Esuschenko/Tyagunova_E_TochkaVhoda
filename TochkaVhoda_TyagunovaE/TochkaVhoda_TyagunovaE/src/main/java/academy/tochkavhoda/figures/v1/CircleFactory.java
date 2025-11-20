package academy.tochkavhoda.figures.v1;

public class CircleFactory {
    private static int count = 0;
    // 1 Создает Circle по координатам центра и значению радиуса.
    public static Circle createCircle(Point center, int radius) {
        count++;
        return new Circle(center, radius);
    }
    // 2 	Возвращает количество Circle, созданных с помощью метода createCircle.
    public static int getCircleCount() {
        return count;
    }
    // 3 Устанавливает количество Circle, созданных с помощью метода createCircle, равным 0 (иными словами, реинициализирует фабрику).
    public static void reset() {
        count = 0;
    }
}