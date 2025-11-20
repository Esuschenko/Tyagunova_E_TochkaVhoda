package academy.tochkavhoda.figures.v1;

import java.util.Objects;

public class Circle {
    private Point center;
    private int radius;
    // 1 	Создает Circle по координатам центра и значению радиуса.
    public Circle(Point center, int radius) {
        this.center = new Point(center.getX(), center.getY());
        this.radius = radius;
    }
    // 2 	Создает Circle по координатам центра и значению радиуса.
    public Circle(int xCenter, int yCenter, int radius) {
        this.center = new Point(xCenter, yCenter);
        this.radius = radius;
    }
    // 3 	Создает Circle с центром в точке (0,0) указанного радиуса.
    public Circle(int radius) {
        this(0, 0, radius);
    }
    // 4 Создает Circle с центром в точке (0,0) с радиусом 1.
    public Circle() {
        this(1);
    }
    // 5 	Возвращает центр Circle.
    public Point getCenter() {
        return new Point(center.getX(), center.getY());
    }
    // 6 Возвращает радиус Circle.
    public int getRadius() {
        return radius;
    }
    // 7 	Устанавливает центр Circle.
    public void setCenter(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }
    // 8 	Устанавливает радиус Circle.
    public void setRadius(int radius) {
        this.radius = radius;
    }
    //  9 	Передвигает Circle так, чтобы его центр оказался в точке  (x, y).
    public void moveTo(int x, int y) {
        center.setX(x);
        center.setY(y);
    }
    // 10 	Передвигает Circle так, чтобы его центр оказался в точке point).
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }
    // 11 	Передвигает Circle на (dx, dy).
    public void moveRel(int dx, int dy) {
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }
    // 12 Увеличивает радиус Circle в n раз, не изменяя центра.Дробная часть вычисленного радиуса отбрасывается.
    public void resize(double ratio) {
        radius = (int) (radius * ratio);
    }
    // 13 Возвращает площадь круга.
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // 14 Возвращает периметр окружности (длину окружности).
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    // 15 Определяет, лежит ли точка (x, y) внутри Circle. Если точка лежит на окружности, считается, что она лежит внутри.
    public boolean isInside(int x, int y) {
        int dx = x - center.getX();
        int dy = y - center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }
    // 16 Определяет, лежит ли точка point внутри Circle. Если точка лежит на окружности, считается, что она лежит внутри.
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}