import java.util.Scanner;

import mdc.MaximoDivisorComum;
import euclides.AlgoritmoEuclides;
import primos.TestePrimalidade;
import primos.FactorizacaoInteiros;
import modular.Congruencia;
import modular.Fermat;
import modular.TeoremaChinesResto;
import euler.TotienteEuler;
import rsa.RSA;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("=== ALGORITMOS DOS NUMEROS ===");

        System.out.println("1 - MDC");
        System.out.println("2 - Algoritmo de Euclides");
        System.out.println("3 - Teste de Primalidade");
        System.out.println("4 - Factorizacao de Inteiros");
        System.out.println("5 - Congruencia Modular");
        System.out.println("6 - Pequeno Teorema de Fermat");
        System.out.println("7 - Totiente de Euler");
        System.out.println("8 - Teorema Chines do Resto");
        System.out.println("9 - RSA");

        System.out.print("Escolha uma opcao: ");
        int opcao = entrada.nextInt();

        switch (opcao) {

            case 1:

                System.out.println("\n=== CALCULO DO MDC ===");

                System.out.print("Digite o primeiro numero: ");
                numero1 = entrada.nextInt();

                System.out.print("Digite o segundo numero: ");
                numero2 = entrada.nextInt();

                int resultadoMDC = MaximoDivisorComum.calcular(numero1, numero2);

                System.out.println("O MDC e: " + resultadoMDC);

                break;

            case 2:

                System.out.println("\n=== ALGORITMO DE EUCLIDES ===");

                System.out.print("Digite o primeiro numero: ");
                numero1 = entrada.nextInt();

                System.out.print("Digite o segundo numero: ");
                numero2 = entrada.nextInt();

                int mdcSimples = MaximoDivisorComum.calcular(numero1, numero2);
                int mdcEuclides = AlgoritmoEuclides.calcular(numero1, numero2);

                System.out.println("MDC simples: " + mdcSimples);
                System.out.println("MDC por Euclides: " + mdcEuclides);

                break;

            case 3:

                System.out.println("\n=== TESTE DE PRIMALIDADE ===");

                System.out.print("Digite um numero: ");
                int numero = entrada.nextInt();

                boolean primo = TestePrimalidade.verificarPrimo(numero);

                if (primo) {

                    System.out.println(numero + " e primo.");

                } else {

                    System.out.println(numero + " nao e primo.");

                }

                break;

            case 4:

                System.out.println("\n=== FACTORIZACAO DE INTEIROS ===");

                System.out.print("Digite um numero: ");
                int numeroFator = entrada.nextInt();

                FactorizacaoInteiros.fatorar(numeroFator);

                break;

            case 5:

                System.out.println("\n=== CONGRUENCIA MODULAR ===");

                System.out.print("Digite o numero: ");
                int numeroModulo = entrada.nextInt();

                System.out.print("Digite o modulo: ");
                int modulo = entrada.nextInt();

                int resultadoModulo = Congruencia.calcularModulo(numeroModulo, modulo);

                System.out.println("Resultado: " + resultadoModulo);

                break;

            case 6:

                System.out.println("\n=== PEQUENO TEOREMA DE FERMAT ===");

                System.out.print("Digite o valor de a: ");
                int a = entrada.nextInt();

                System.out.print("Digite o numero primo p: ");
                int p = entrada.nextInt();

                long resultadoFermat = Fermat.calcularFermat(a, p);

                System.out.println("Resultado: " + resultadoFermat);

                break;

            case 7:

                System.out.println("\n=== TOTIENTE DE EULER ===");

                System.out.print("Digite um numero: ");
                int n = entrada.nextInt();

                int resultadoEuler = TotienteEuler.calcular(n);

                System.out.println("Totiente de Euler: " + resultadoEuler);

                break;

            case 8:

                System.out.println("\n=== TEOREMA CHINES DO RESTO ===");

                System.out.print("Digite o primeiro resto (a1): ");
                int a1 = entrada.nextInt();

                System.out.print("Digite o primeiro modulo (m1): ");
                int m1 = entrada.nextInt();

                System.out.print("Digite o segundo resto (a2): ");
                int a2 = entrada.nextInt();

                System.out.print("Digite o segundo modulo (m2): ");
                int m2 = entrada.nextInt();

                int resultadoTCR = TeoremaChinesResto.resolver(a1, m1, a2, m2);

                System.out.println("Resultado: " + resultadoTCR);

                break;

            case 9:

                System.out.println("\n=== SISTEMA RSA ===");

                System.out.print("Digite a mensagem: ");
                int mensagem = entrada.nextInt();

                System.out.print("Digite o valor de e: ");
                int e = entrada.nextInt();

                System.out.print("Digite o valor de n: ");
                int valorN = entrada.nextInt();

                long resultadoRSA = RSA.criptografar(mensagem, e, valorN);

                System.out.println("Mensagem criptografada: " + resultadoRSA);

                break;

            default:

                System.out.println("Opcao invalida.");
        }

        entrada.close();
    }
}