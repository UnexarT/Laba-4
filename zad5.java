import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите данные первой точки на прямой: x, y:");
        double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        System.out.println("Введите данные второй точки на прямой: x, y:");
        double x2 = scn.nextDouble();
        double y2 = scn.nextDouble();
        while (x2 == x1 || y2 == y1){
            System.out.println("Первая и вторая точки совпали!");
            System.out.println("Введите данные второй точки на прямой: x, y:");
            x2 = scn.nextDouble();
            y2 = scn.nextDouble();
        }
        System.out.println("Введите данные проецируемой точки: x, y:");
        double x3 = scn.nextDouble();
        double y3 = scn.nextDouble();
        double[] xy = ProgectXY(x1,y1,x2,y2,x3,y3);
        System.out.println("Координаты проекции: x = " + xy[0] + " и y = " + xy[1]);
    }
    /* (x - x1)/(x2 - x1) = (y - y1)/(y2 - y1) = t - канон. уравнение прямой
         выводим x = (x2 - x1)t + x1 и  y = (y2 - y1)t + y1
         из (x2 - x1)x + (y2 - y1)y - (x2 - x1)x3 - (y2 - y1)y3 = 0 получаем t */
    public static double[] ProgectXY(double x1, double y1, double x2,
                                     double y2, double x3, double y3){
        double[] xy = new double[2];
        double m = x2 - x1;
        double p = y2 - y1;
        double t = (m*x3 + p*y3 - m*x1 - p*y1) / (m*m + p*p);
        xy[0] = m*t + x1; /* это x */
        xy[1] = p*t + y1; /* а это y */
        return xy;
    }
}

