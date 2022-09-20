import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.print.attribute.standard.Media;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            case 1:
                System.out.println("Digite a nota 1: ");
                double nota1 = scanner.nextDouble();

                System.out.println("Digite a nota 2: ");
                double nota2 = scanner.nextDouble();

                System.out.println("Digite a nota 3: ");
                double nota3 = scanner.nextDouble();

                System.out.println("A média é:" + media(nota1, nota2, nota3));
                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
                System.out.println("Digite o 1° lado: ");
                double lado1 = scanner.nextDouble();

                System.out.println("Digite o 2° lado: ");
                double lado2 = scanner.nextDouble();

                System.out.println("A area é:" + area(lado1, lado2));
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
                System.out.println("Digite a largura: ");
                double largura = scanner.nextDouble();

                System.out.println("Digite a altura ");
                double altura = scanner.nextDouble();

                System.out.println("Digite a profundidade: ");
                double profundidade = scanner.nextDouble();

                System.out.println("O volume é:" + volume(largura, altura, profundidade));
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro
            // valor
            case 4:
                System.out.println("Digite um  valor: ");
                int baseVerificar = scanner.nextInt();

                System.out.println("Digite o valor:  ");
                int dobroverificar = scanner.nextInt();

                System.out.println(
                        "O verificador é maior que a base? " + valorMaiorQueDobro(baseVerificar, dobroverificar));
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                System.out.println("Digite a valor a: ");
                int a = scanner.nextInt();

                System.out.println("Digite o valor b: ");
                int b = scanner.nextInt();

                System.out.println("Digite o valor c: ");
                int c = scanner.nextInt();

                System.out.println("O resultado de baskara é:" + bhaskara(a, b, c));
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia
            // (km) / tempo (h)`)
            case 6:
                System.out.println("Digite a distancia: ");
                double distancia = scanner.nextDouble();

                System.out.println("Digite o tempo:  ");
                double tempo = scanner.nextInt();

                System.out.println("A velocidade média da viagem é: " + mediaViagem(distancia, tempo));
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \
            // qtd imposto`)
            case 7:
                System.out.println("Digite o faturamento: ");
                int faturamento = scanner.nextInt();

                System.out.println("Digite imposto:  ");
                int qtdImposto = scanner.nextInt();
                System.out.println("O porcentual do imposto é: " + percentualImposto(faturamento, qtdImposto));
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
                System.out.println("Digite um  valor: ");
                int valor = scanner.nextInt();

                System.out.println("Esse valor é par? " + parOuImpar(valor));
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                System.out.println("Digite uma palavra: ");
                String stringUm = scanner.nextLine();

                System.out.println("Digite imposto:  ");
                String stringDois = scanner.nextLine();

                System.out.println("Esse valor é:" + compareString(stringUm, stringDois));
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta
            // seu valor para inteiro
            case 10:
                System.out.println("Digite o valor: ");
                String valorString = scanner.nextLine();

                System.out.println("O número convertido é " + convertString(valorString));

                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda
            // conforme abaixo:
            // Base | Alíquota
            // --------- | ------
            // Até 1.903,98 | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68 | 27,5%
            case 11:
                System.out.println("Digite o salario: ");
                double salario = scanner.nextDouble();

                System.out.println("O imposto é" + percentualImpostoSalario(salario));
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                System.out.println("Digite numero:  ");
                int numero = scanner.nextInt();
                System.out.println("O numero é primo?" + testePrimo(numero));
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    /*
     * Modificador public static
     * Tipo Retorno double
     * nome fn media
     * argumentos(tipo nome) (n1,n2,n3)
     */
    public static double media(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static double area(double lado1, double lado2) {
        return (lado1 * lado2);
    }

    public static double volume(double largura, double altura, double profundidade) {
        return (largura * altura * profundidade);
    }

    public static boolean valorMaiorQueDobro(int valorVerificar, int dobroverificar) {
        if (valorVerificar > dobroverificar * 2) {
            return true;
        } else {
            return false;
        }
    }

    public static double[] bhaskara(int a, int b, int c) {
        double delta = (b * b) - (4 * a * c);
        double x1 = 0;
        double x2 = 0;
        if (delta < 0) {
            System.out.println("Delta é negativo");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            x2 = x1;
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
        System.out.println(x1);
        System.out.println(x2);

        return new double[] { x1, x2 };
    }

    public static double mediaViagem(double distancia, double tempo) {
        return (distancia / tempo);
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        return (qtdImposto * 100) / faturamento;
    }

    public static boolean parOuImpar(int valor) {
        if (valor % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean compareString(String stringUm, String stringDois) {
        if (stringDois.equals(stringUm))
            return true;
        else
            return false;
    }

    public static int convertString(String valorString) {
        Double value = Double.parseDouble(valorString);
        return value.intValue();
    }

    public static double percentualImpostoSalario(double salario) {
        double percentual = -1;
        if (salario <= 1903.98) {// Até 1.903,98 | Isento
            percentual = 0;
        } else if (salario >= 1903.99 && salario <= 2826.65) { // De 1.903,99 até 2.826,65 | 7,5%
            percentual = 7.5;
        } else if (salario >= 2826.66 && salario <= 3751.05) { // De 2.826,66 até 3.751,05 | 15%
            percentual = 15;
        } else if (salario >= 3751.06 && salario <= 5664.68) { // De 3.751,06 até 4.664,68 | 22,5%
            percentual = 22.5;
        } else if (salario > 4664.68) { // Acima de 4.664,68 | 27,5%
            percentual = 27.5;
        }
        return percentual;
    }

    public static boolean testePrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}