package academy.tochkavhoda.figures.v1;

public class Square extends Rectangle {
    // Создаёт квадрат с левым верхним углом в точке leftTop и стороной size
    public Square(Point leftTop, int size) {
        super(leftTop, new Point(leftTop.getX() + size, leftTop.getY() + size));
    }
    // Создаёт квадрат с левым верхним углом в (xLeft, yTop) и стороной size
    public Square(int xLeft, int yTop, int size) {
        super(xLeft, yTop, xLeft + size, yTop + size);
    }
    // Создаёт квадрат со стороной size и левым нижним углом в начале координат (0,0)
    public Square(int size) {
        super(size, size);
    }
    // Создаёт квадрат со стороной 1 и левым нижним углом в начале координат (0,0)
    public Square() {
        super(1, 1);
    }

}