package mdc;

public class MaximoDivisorComum {

    public static int calcular(int a, int b) {

        int mdc = 1;

        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i == 0 && b % i == 0) {

                mdc = i;

            }
        }

        return mdc;
    }
}