package euclides;

public class AlgoritmoEuclides {

    public static int calcular(int a, int b) {

        while(b != 0) {

            int resto = a % b;

            a = b;

            b = resto;
        }

        return a;
    }
}