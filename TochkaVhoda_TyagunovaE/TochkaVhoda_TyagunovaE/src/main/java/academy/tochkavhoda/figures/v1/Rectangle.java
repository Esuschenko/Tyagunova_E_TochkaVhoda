package academy.tochkavhoda.figures.v1;

import java.util.Objects;

public class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    // 1 Создает Rectangle по координатам углов - левого верхнего и правого нижнего.
    public Rectangle(Point leftTop, Point rightBottom) {
        this.topLeft = new Point(leftTop.getX(), leftTop.getY());
        this.bottomRight = new Point(rightBottom.getX(), rightBottom.getY());
    }

    // 2 Создает Rectangle по координатам углов - левого верхнего и правого нижнего.
    public Rectangle(int xLeft, int yTop, int xRight, int yBottom) {
        this.topLeft = new Point(xLeft, yTop);
        this.bottomRight = new Point(xRight, yBottom);
    }

    // 3 Создает Rectangle, левый верхний угол которого находится в начале координат, а длина и ширина задаются.
    public Rectangle(int length, int width) {
        this.topLeft = new Point(0, -width);
        this.bottomRight = new Point(length, 0);
    }

    // 4 Создает Rectangle с размерами (1,1), левый верхний угол которого находится в начале координат.
    public Rectangle() {
        this(1, 1);
    }

    // 5 Возвращает левую верхнюю точку Rectangle.
    public Point getTopLeft() {
        return new Point(topLeft.getX(), topLeft.getY());
    }

    // 6 Возвращает правую нижнюю точку Rectangle.
    public Point getBottomRight() {
        return new Point(bottomRight.getX(), bottomRight.getY());
    }

    // 7 Устанавливает левую верхнюю точку Rectangle
    public void setTopLeft(Point topLeft) {
        int length = getLength();
        int width = getWidth();
        this.topLeft = new Point(topLeft.getX(), topLeft.getY());
        this.bottomRight = new Point(topLeft.getX() + length, topLeft.getY() + width);
    }

    // 8 Устанавливает правую нижнюю точку Rectangle.
    public void setBottomRight(Point bottomRight) {
        int length = getLength();
        int width = getWidth();
        this.bottomRight = new Point(bottomRight.getX(), bottomRight.getY());
    }

    // 9 Возвращает длину прямоугольника.
    public int getLength() {
        return bottomRight.getX() - topLeft.getX();
    }

    // 10 Возвращает ширину прямоугольника
    public int getWidth() {
        return bottomRight.getY() - topLeft.getY();
    }

    // 11 Передвигает Rectangle в точку (x, y).
    public void moveTo(int x, int y) {
        int length = getLength();
        int width = getWidth();
        topLeft.setX(x);
        topLeft.setY(y);
        bottomRight.setX(x + length);
        bottomRight.setY(y + width);
    }

    // 12 Передвигает Rectangle в точку point
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    // 13 Передвигает Rectangle на (dx, dy).
    public void moveRel(int dx, int dy) {
        topLeft.setX(topLeft.getX() + dx);
        topLeft.setY(topLeft.getY() + dy);
        bottomRight.setX(bottomRight.getX() + dx);
        bottomRight.setY(bottomRight.getY() + dy);
    }

    // 14 Изменяет обе стороны Rectangle в ratio раз при сохранении координат левой верхней вершины.
    public void resize(double ratio) {
        int newLength = (int) (getLength() * ratio);
        int newWidth = (int) (getWidth() * ratio);
        bottomRight.setX(topLeft.getX() + newLength);
        bottomRight.setY(topLeft.getY() + newWidth);
    }

    // 15 Изменяет длину Rectangle в xRatio раз, а ширину в yRatio раз при сохранении координат левой верхней вершины.
    public void stretch(double xRatio, double yRatio) {
        int newLength = (int) (getLength() * xRatio);
        int newWidth = (int) (getWidth() * yRatio);
        bottomRight.setX(topLeft.getX() + newLength);
        bottomRight.setY(topLeft.getY() + newWidth);
    }

    // 16 Возвращает площадь прямоугольника.
    public double getArea() {
        return Math.abs(getLength() * getWidth());
    }

    // 17 Возвращает периметр прямоугольника.
    public double getPerimeter() {
        return 2 * (Math.abs(getLength()) + Math.abs(getWidth()));
    }

    // 18 Определяет, лежит ли точка (x, y) внутри Rectangle.
    public boolean isInside(int x, int y) {
        int minX = Math.min(topLeft.getX(), bottomRight.getX());
        int maxX = Math.max(topLeft.getX(), bottomRight.getX());
        int minY = Math.min(topLeft.getY(), bottomRight.getY());
        int maxY = Math.max(topLeft.getY(), bottomRight.getY());

        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }

    // 19 Определяет, лежит ли точка point внутри Rectangle.
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    // 20 Определяет, пересекается ли Rectangle с другим Rectangle.
    public boolean isIntersects(Rectangle rectangle) {
        int thisMinX = Math.min(topLeft.getX(), bottomRight.getX());
        int thisMaxX = Math.max(topLeft.getX(), bottomRight.getX());
        int thisMinY = Math.min(topLeft.getY(), bottomRight.getY());
        int thisMaxY = Math.max(topLeft.getY(), bottomRight.getY());

        int otherMinX = Math.min(rectangle.getTopLeft().getX(), rectangle.getBottomRight().getX());
        int otherMaxX = Math.max(rectangle.getTopLeft().getX(), rectangle.getBottomRight().getX());
        int otherMinY = Math.min(rectangle.getTopLeft().getY(), rectangle.getBottomRight().getY());
        int otherMaxY = Math.max(rectangle.getTopLeft().getY(), rectangle.getBottomRight().getY());

        return !(otherMinX > thisMaxX ||
                otherMaxX < thisMinX ||
                otherMinY > thisMaxY ||
                otherMaxY < thisMinY);
    }

    // 21 Определяет, лежит ли rectangle целиком внутри текущего Rectangle.
    public boolean isInside(Rectangle rectangle) {
        int thisMinX = Math.min(topLeft.getX(), bottomRight.getX());
        int thisMaxX = Math.max(topLeft.getX(), bottomRight.getX());
        int thisMinY = Math.min(topLeft.getY(), bottomRight.getY());
        int thisMaxY = Math.max(topLeft.getY(), bottomRight.getY());

        int otherMinX = Math.min(rectangle.getTopLeft().getX(), rectangle.getBottomRight().getX());
        int otherMaxX = Math.max(rectangle.getTopLeft().getX(), rectangle.getBottomRight().getX());
        int otherMinY = Math.min(rectangle.getTopLeft().getY(), rectangle.getBottomRight().getY());
        int otherMaxY = Math.max(rectangle.getTopLeft().getY(), rectangle.getBottomRight().getY());

        return otherMinX >= thisMinX && otherMaxX <= thisMaxX &&
                otherMinY >= thisMinY && otherMaxY <= thisMaxY;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(topLeft, rectangle.topLeft) && Objects.equals(bottomRight, rectangle.bottomRight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, bottomRight);
    }
}