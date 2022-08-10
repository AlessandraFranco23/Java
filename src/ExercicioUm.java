import java.util.Scanner;

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
                System.out.println("A média é:" + media(10, 2, 8));
                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
                System.out.println("A área " + area(5, 2));
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
                System.out.println ("O volume é:" + volume( 10, 6, 3));
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
                System.out.println("Esse número é maior que a base:" + valorMaiorQueDobro(20, 51));
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                System.out.println ("O resultado de baskara é:" + bhaskara(1, 4, 1));
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:
                System.out.println("A velocidade média da viagem é: " + mediaViagem(80, 3)); 
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:
                System.out.println("O porcentual do imposto é: " + percentualImposto(100, 20));
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
                System.out.println("Esse valor é par? " + parOuImpar(32)); 
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                //System.out.println("Esse valor é:" + compareString(String stringUm, String stringDois)); 
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                System.out.println("O número convertido é " + convertString(valor:5.5));
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
                System.out.println("O imposto é" + percentualImpostoSalario( 1999.99));
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                // testePrimo(int valor)
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {
        return (notaUm+notaDois+notaTres) / 3;
    }

    public static double area(double ladoUm, double ladoDois) {
        return (ladoUm*ladoDois);
    }

    public static double volume(double largura, double altura, double profundidade) {
        return (largura*altura*profundidade);
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        if (base>verificar*2)
        return true; 
            else 
                return false;
            
        
        
    }

    public static double[] bhaskara(int a, int b, int c) {
        double delta = (b*b)-(4*a*c);
        double x1=0;
        double x2=0;
        if (delta < 0) {
            System.out.println("Delta é negativo");
        } else if (delta ==0) {
            x1 = -b/(2*a);
            x2 = x1; 
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
        }
        System.out.println(x1);
        System.out.println(x2);

        return new double[] {x1,x2};
    }

    public static double mediaViagem(double distancia, double tempo) {
        return (distancia/tempo);
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        return (qtdImposto*100)/faturamento;
    }

    public static boolean parOuImpar(int valor) {
        return false;
    }

    public static boolean compareString(String stringUm, String stringDois) {
        return false;
    }

    public static int convertString(String valor) { 
        return {int} Double.parseDouble(valor);
    }

    public static double percentualImpostoSalario(double salario) {
        if (salario <= 1903.98 ){
            return 0;
        } else if (salario <= 1903.99 && salario >= 2826.65) {
            return 7.5;
        } else if (salario <= 1903.99 && salario >= 2826.65) {
            return 15;
        }else if (salario <= 1903.99 && salario >= 2826.65){
            return 22.5;
        }else if (salario <= 1903.99 && salario >= 2826.65){
        return 27.5;
        }
        return -1;
    }

    public static boolean testePrimo(int valor) {
        return false;
    }

}