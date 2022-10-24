import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите данные N, X, Y, K:");
        double N = scn.nextDouble();
        double X = scn.nextDouble();
        double Y = scn.nextDouble();
        double K = scn.nextDouble();
        double LastMes = (X - 2 * Y/K) / (N - 2);
        if (LastMes > 0 & (N != 2 || K != 0)) {
            System.out.println("Кол-во овощей израсходованных в последний месяц: " + LastMes + " Кг");
        } else {
            System.out.println("Ошибка данных");
        }
    }
}
