package exercitiul1;

import java.lang.Math;

public class Calculator {
    static double Sum(double a, double b) {
        double sum = a + b;
        return sum;

    }

    static double Scadere(double a, double b) {
        double scadere = a - b;
        return scadere;
    }

    static double Impartire(double a, double b) {
        double impartire = a / b;
        return impartire;
    }

    static double Putere(double a, double b) {
        double putere = Math.pow(a, b);
        return putere;
    }

    static double Inmultirea(double a, double b) {
        double inmultirea = a * b;
        return inmultirea;
    }
}
