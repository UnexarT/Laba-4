import java.util.Scanner;

public class zad3 {
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите данные p, h1, h2:");
        double p = scn.nextDouble();
        double h1 = scn.nextDouble();
        double h2 = scn.nextDouble();
        if (((2 * (h1 + h2) / p) < -1) || ((2 * (h1 + h2) / p) > 1)) {
            System.out.println("Ошибка данных");
        } else {
            double Ugol1 = Math.asin(2 * (h1 + h2) / p) *180/Math.PI;
            double Ugol2 = 180 - Ugol1;
            System.out.println("Меньший угол равен " + Ugol1);
            System.out.println("Больший угол равен " + Ugol2);
        }
    }
}
