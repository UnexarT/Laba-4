import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите данные S, v, L:");
        double S, v, L, b, D, x1, x2;
        S = scn.nextDouble();
        v = scn.nextDouble();
        L = scn.nextDouble();
        /* S(1/(x+v) + 1/(x-v)) = L/v - 1 пиводим в
            x^2 - 2Svx/(L-v) - v^2 = 0*/
        if (L - v != 0) {
            b = -2 * S * v / (L - v);
            D = Math.pow(b, 2) + 4 * v * v;
            x1 = (-b + Math.pow(D, 1 / 2f)) / 2;
            x2 = (-b - Math.pow(D, 1 / 2f)) / 2;
            if (x1 > 0) {
                System.out.println("Корень уравнения " + x1);
            } else if (x2 > 0) {
                System.out.println("Корень уравнения " + x2);
            } else {
                System.out.println("Нет решений");
            }
        } else {
            System.out.println("Нет решений");
        }
    }
}
