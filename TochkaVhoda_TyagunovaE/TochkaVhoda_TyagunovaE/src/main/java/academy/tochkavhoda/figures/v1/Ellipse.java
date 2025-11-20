package academy.tochkavhoda.figures.v1;

public class Ellipse {
    private Point center;   // центр эллипса
    private int xAxis;      // полная длина горизонтальной оси (диаметр по X)
    private int yAxis;      // полная длина вертикальной оси (диаметр по Y)

    // 1. Создаёт эллипс по центру и размерам осей
    public Ellipse(Point center, int xAxis, int yAxis) {
        this.center = new Point(center.getX(), center.getY());
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    // 2. Создаёт эллипс по координатам центра
    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        this.center = new Point(xCenter, yCenter);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    // 3. Создаёт эллипс с центром в (0,0)
    public Ellipse(int xAxis, int yAxis) {
        this(0, 0, xAxis, yAxis);
    }

    // 4. Создаёт эллипс с центром в (0,0) и единичными осями
    public Ellipse() {
        this(1, 1);
    }

    // 5. Возвращает центр эллипса
    public Point getCenter() {
        return new Point(center.getX(), center.getY());
    }

    // 6. Возвращает длину горизонтальной оси
    public int getXAxis() {
        return xAxis;
    }

    // 7. Возвращает длину вертикальной оси
    public int getYAxis() {
        return yAxis;
    }

    // 8. Устанавливает длину горизонтальной оси
    public void setXAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    // 9. Устанавливает длину вертикальной оси
    public void setYAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    // 10. Устанавливает центр эллипса
    public void setCenter(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }

    // 11. Перемещает эллипс так, чтобы центр оказался в (x, y)
    public void moveTo(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    // 12. Перемещает эллипс в заданную точку
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    // 13. Смещает эллипс на вектор (dx, dy)
    public void moveRel(int dx, int dy) {
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }

    // 14. Увеличивает обе оси в ratio раз (дробная часть отбрасывается)
    public void resize(double ratio) {
        xAxis = (int) (xAxis * ratio);
        yAxis = (int) (yAxis * ratio);
    }

    // 15. Растягивает оси по-разному: X — в xRatio раз, Y — в yRatio раз
    public void stretch(double xRatio, double yRatio) {
        xAxis = (int) (xAxis * xRatio);
        yAxis = (int) (yAxis * yRatio);
    }

    // 16. Площадь эллипса: π × (полуось X) × (полуось Y)
    public double getArea() {
        return Math.PI * (xAxis / 2.0) * (yAxis / 2.0);
    }

    // 17. Приближённый периметр эллипса по формуле из задания
    public double getPerimeter() {
        double a = xAxis / 2.0;  // полуось по X
        double b = yAxis / 2.0;  // полуось по Y
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2.0);
    }

    // 18. Проверяет, лежит ли точка внутри эллипса (включая границу)
    public boolean isInside(int x, int y) {
        double dx = x - center.getX();
        double dy = y - center.getY();

        double halfX = xAxis / 2.0;
        double halfY = yAxis / 2.0;

        return (dx * dx) / (halfX * halfX) + (dy * dy) / (halfY * halfY) <= 1.0;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    // 20. equals и hashCode сгенерированы через IDEA (Alt+Insert → equals() and hashCode())
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return xAxis == ellipse.xAxis && yAxis == ellipse.yAxis && center.equals(ellipse.center);
    }

    @Override
    public int hashCode() {
        return 31 * (31 * center.hashCode() + xAxis) + yAxis;
    }
}