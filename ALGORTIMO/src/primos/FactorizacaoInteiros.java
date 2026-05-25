package primos;

public class FactorizacaoInteiros {

    public static void fatorar(int numero) {

        System.out.print("Fatores primos: ");

        for (int i = 2; i <= numero; i++) {

            while (numero % i == 0) {

                System.out.print(i + " ");
                numero = numero / i;

            }
        }

        System.out.println();
    }
}