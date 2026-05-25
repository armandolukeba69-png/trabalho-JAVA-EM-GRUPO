package modular;

public class TeoremaChinesResto {

    public static int resolver(int a1, int m1, int a2, int m2) {

        int x = 0;

        while (true) {

            if (x % m1 == a1 && x % m2 == a2) {

                return x;

            }

            x++;
        }
    }
}