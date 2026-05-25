package rsa;

public class RSA {

    public static long criptografar(int mensagem, int e, int n) {

        long resultado = 1;

        for (int i = 0; i < e; i++) {

            resultado = (resultado * mensagem) % n;

        }

        return resultado;
    }
}