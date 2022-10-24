import static java.lang.Math.*;
public class zad1 {
    public static String K(double t, double l, double y) {
        if (y <= 0 || log(y) + exp(2*l) == 0) {
            return "Ошибка";
        } else {
            double Chislitel = 2 * pow(t, 2) + 3 * l + 7.2;
            double Znamenatel = log(y) + exp(2*l);
            return String.valueOf(Chislitel / Znamenatel);
        }
    }
    public static String L(double a, double x, double y, double z) {
        if (y * z < -1 || y * z > 1 || abs(x - sin(y * z)) > 1 || abs(x * pow(y, 3) - z) == 0 || abs(log(abs(x * pow(y, 3) - z))) > 1) {
            return "Ошибка";
        } else {
            double first = a - exp(2 * cos(abs(x - sin(y * z))));
            double sec = E * cos(abs(log(abs(x * pow(y, 3) - z))));
            return String.valueOf(first + sec);
        }
    }
    public static void main(String[] args) {
        String K = K(0,1,-80);
        String L = L(100,0,1,1);
        /*if (K.equals("Ошибка")) {
            System.out.println("Ошибка в данных 1-го уравнения");
        } else {
            System.out.println("K = " + K);
        }*/
        if (L.equals("Ошибка")) {
            System.out.println("Ошибка в данных 2-го уравнения");
        } else {
            System.out.println("L = " + L);
        }
    }
}

