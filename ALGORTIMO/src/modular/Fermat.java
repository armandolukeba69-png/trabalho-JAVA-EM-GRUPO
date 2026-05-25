package modular;

public class Fermat {

    public static long calcularFermat(int a, int p) {

        long resultado = 1;

        for (int i = 1; i < p; i++) {

            resultado = (resultado * a) % p;

        }

        return resultado;
    }
}