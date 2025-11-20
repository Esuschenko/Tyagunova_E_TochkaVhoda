package academy.tochkavhoda.introduction;

public class ZeroSteps1 {
    //сумма 2 чисел
    public int sum (int x, int y){
        return x+y;
    }
    //умножение 2 чисел
    public int mul (int x, int y){
        return x*y;
    }
    //деление 2 чисел
    public int div(int x, int y){
        return x/y;
    }
    //остаток от деления
    public int mod (int x, int y){
        return x%y;
    }
    //если x==y - true, иначе false
    public boolean isEqual (int x, int y) {
        return  x==y;
    }
    //если x>y - true, иначе false
    public boolean isGreater(int x, int y){
        return x>y;
    }
    //найти S прямоугольного треугольника через 2 катета
    public double calculateTriangleSquare (int side1, int side2){
        return side1 * side2 / 2.0;
    }
    //найти периметр прямоугольного треугольника через 2 катета
    public double calculateTrianglePerimeter(int side1, int side2){
        double side3=Math.sqrt(side1*side1+side2*side2);
        return side3+side1+side2;
    }
    //изменить порядок 3-значного числа
    public int reverseNumber(int number){
        int hundred = number/100;
        int ten = (number/10)%10;
        int one = number%10;
        return one*100+ten*10+hundred;
    }
    //возвести целое число в его степень 15, использовать не более 5 умножений
    public long calculate15Degree(int number){
        long n = number;
        long n2=n*n;
        long n3=n2*n;
        long n6 = n3*n3;
        long n12 = n6*n6;
        return n12*n3;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return x>=xLeft && x<=xRight && y>=yTop && y <= yBottom;
    }
    //находит квадратный корень абсолютной величины числа
    public double sqrtAbs(int number){
        return Math.sqrt(Math.abs(number));
    }
    //возвращает true, если существует и треугольник с такими 3-мя сторонами. Иначе false
    public boolean isTriangleExist(int side1, int side2, int side3){
        return side1+side2>side3&&
                side2+side3>side1&&
                side1+side3>side2;
    }
    //произведение цифр 4-значного числа
    public int getDigitsProduction(int number){
        int n1 = number/1000;
        int n2 = (number/100)%10;
        int n3 = (number/10)%10;
        int n4 = number%10;
        return n1*n2*n3*n4;
    }
    //возвращает true, если круг радиуса radius может поместиться внутри квадрата со стороной side, не касаясь окружности, иначе false
    public boolean isCircleInsideSquare(int radius, int side){
        return 2*radius <side;
    }
    //возвращает символ с кодом code
    public char getCharByCode(short code){
        return (char) code;
    }
    //возвращает символ с кодом character
    public short getCodeByChar (char character){
        return (short) character;
    }
    //возвращает код символа, который имеет код на offset больше, чем символ ch
    public char getCharByCodeAndOffset(char ch, short offset){
        return (char) (ch+offset);
    }
    //если код ch1>=ch2 - true, иначе - false
    public boolean isGreaterOrEqual(char ch1, char ch2){
        return ch1 >=ch2;
    }
    //символ с кодом, равным полусумме ch1 и ch2
    public char getAverageChar(char ch1, char ch2){
        return (char) ((ch1+ch2)/2);
    }
}