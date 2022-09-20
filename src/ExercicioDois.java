import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDois {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 2 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Mês do Ano                                        |");
        System.out.println("| 3 - Forca                                             |");
        System.out.println("| 4 - Tabuada                                           |");
        System.out.println("| 5 - Letra a Letra                                     |");
        System.out.println("| 6 - Número ímpares multiplos de 7                     |");
        System.out.println("| 7 - Calcule a Média de Notas informadas               |");
        System.out.println("| 8 - Fatorial                                          |");
        System.out.println("| 9 - Calculo IMC                                       |");
        System.out.println("| 10 - Operadores                                       |");
        System.out.println("| 11 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que receba três notas calcule a média e diga se foi
            // aprovado (`(nota1 + nota2 + nota3 / 3)`) e (`média maior que 7 para ser
            // aprovado`).
            case 1:
                System.out.println("Informe a primeira nota:");
                double notaUm = scanner.nextDouble();
                System.out.println("Informe a segunda nota:");
                double notaDois = scanner.nextDouble();
                System.out.println("Informe a terceira nota:");
                double notaTres = scanner.nextDouble();
                double media = calculaMedia(notaUm, notaDois, notaTres);
                boolean isMaior7 = media > 7;
                if (isMaior7) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }
                break;
            // 2) Crie um programa que receba um número e indique o mês que representa.
            case 2:
                System.out.println("Informe o numero do mês:");
                int mes = scanner.nextInt();

                System.out.println(qualMes(mes));
                break;
            // 3) Crie um programa que simule um jogo da forca, com a entrada da palavra
            // oculta, a quantidade de tentativas para acerto e depois solicite a entrada da
            // palavra. A cada erro deve imprimir a quantidade de tentativas restantes e o
            // 'membro' que foi marcado. Ao final deve imprimir se acertou ou não a palavra
            // e se foi 'enforcado'.
            case 3:
                // forca(String palavra, int tentativa, Scanner scanner);
                System.out.println("Digite a palavra oculta");
                String palavraForca = scanner.next();
                System.out.println("Digite a quantidade de tentativas");
                int tentativas = scanner.nextInt();

                for (int i = tentativas; i > 0; i--) {
                    System.out.println("Digite a palavra da tentativa " + i + ": ");
                    String palavraTentativa = scanner.next();

                    if (palavraForca.equals(palavraTentativa)) {
                        System.out.println("Acertou!!");
                        break;
                    } else {
                        System.out.println("Errou!!");
                        if (i == 1) {
                            System.out.println("Enforcado!");
                        }
                    }
                }

                break;
            // 4) Crie um programa que imprima a tabuada de 0 a 10.
            case 4:
                System.out.println("Informe a tabuada:");
                int numeroTabuada = scanner.nextInt();

                int[] tabuada = tabuada(numeroTabuada);
                for (int i = 0; i < tabuada.length; i++) {
                    System.out.println(tabuada[i]);
                }
                break;
            // 5) Crie um programa que receba uma String e imprima linha a linha suas
            // letras.
            case 5:
                System.out.println("Digite uma palavra");
                try {
                    Scanner scannerPalavra = new Scanner(System.in);
                    String palavra = scannerPalavra.nextLine();
                    char[] letras = letraALetra(palavra);
                    for (char c : letras) {
                        System.out.println(c);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                break;
            // 6) Crie um programa que de a soma de todos os números ímpares e múltiplos de
            // 7 entre 1 e 500.
            case 6:
                System.out.println(numerosImpares());
                break;
            // 7) Crie um programa que tenha como entrada as notas de um aluno. Somente se
            // encerrará quando for inserida uma nota negativa. Ao final deverá informar a
            // média das notas.
            case 7:
                List<Double> notasTemp = new ArrayList<Double>();
                boolean notaPositiva = true;
                while (notaPositiva) {
                    System.out.println("Informe a  nota:");
                    double nota = scanner.nextDouble();
                    notaPositiva = nota > 0;
                    notasTemp.add(nota);
                }
                double[] notas = new double[notasTemp.size()]; 
                for (int i = 0; i < notasTemp.size(); i++) {
                    notas[i] = notasTemp.get(i).doubleValue();
                }

                System.out.println(calculaMedia(notas));
                break;
            // 8) Crie um programa que receba um valor e imprima o fatorial desse número.
            // Ex.: 3! = 3 x 2 x 1 = 6.
            case 8:
                // fatorial(int numero);
                System.out.println("Digite o número: ");
                int numero = scanner.nextInt();
                System.out.print(fatorial(numero));
                break;
            // 9) Crie um programa que receba a altera e o peso e calcule o IMC:
            //
            // IMC | Classificação
            // --- | ------
            // Abaixo de 18,5 | Abaixo do Peso
            // Entre 18,6 e 24,9 | Peso Ideal
            // Entre 25,0 e 29,9 | Levemente acima do peso
            // Entre 30,0 e 34,9 | Obesidade Grau I
            // Entre 35,0 e 39,9 | Obesidade Grau II
            // Acima de 40 | Obesidade Grau III (mórbida)
            case 9:
                System.out.println("Informe a altura:");
                double altura = scanner.nextDouble();

                System.out.println("Informe a peso:");
                double peso = scanner.nextDouble();

                double imc = imc(altura,  peso);
                boolean isAbaixoPeso = imc < 18.5;
                boolean isPesoIdeal = imc > 18.6 && imc < 24.9;
                boolean isLevementeAcimaPeso = imc > 25 && imc < 29.9;
                boolean isObesidadeGrau1 = imc > 30 && imc < 34.9;
                boolean isObesidadeGrau2 = imc > 35 && imc < 39.9;
                boolean isObesidadeGrau3 = imc > 40;

                if (isAbaixoPeso) System.out.println("Abaixo do peso");
                if (isPesoIdeal) System.out.println("Peso ideal");
                if (isLevementeAcimaPeso) System.out.println("Levemnte Acima do Peso");
                if (isObesidadeGrau1) System.out.println("Obesidade Grau 1");
                if (isObesidadeGrau2) System.out.println("Obesidade Grau 2");
                if (isObesidadeGrau3) System.out.println("Obesidade Grau 3");
                
                break;
            // 10) Crie um programa que receba dois valores e solicite a operação a ser
            // realizada (+ - * /). Ao final imprima o resultado.
            case 10:
                System.out.println("Informe a valorUm:");
                int valorUm = scanner.nextInt();

                System.out.println("Informe a valorDois:");
                int valorDois = scanner.nextInt();

                System.out.println("Informe a operacao:");
                char operacao= scanner.next().charAt(0);

                System.out.println( operador( valorUm,  valorDois,  operacao));
                break;
            // DESAFIO: Crie um programa que receba um valor em reais e determine qual o
            // mínimo de notas necessárias para entregá-lo. <br> Notas: R$ 200, R$ 100, R$
            // 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5
            case 11:
                // notasNecessarias(int valor);
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double calculaMedia(double notaUm, double notaDois, double notaTres) {
        return (notaUm + notaDois + notaTres) / 3;
    }

    public static String qualMes(int mes) {
        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                throw new Error("Numero de mes invalido");
        }
    }

    public static int[] tabuada(int numero) {
        int[] tabuada = new int[10];
        for (int i = 0; i < 10; i++) {
            tabuada[i] = numero * i;
        }
        return tabuada;
    }

    public static char[] letraALetra(String palavra) {
        if (palavra == null || palavra == "")
            throw new IllegalArgumentException("Palavra deve conter valor");
        char[] letras = new char[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            letras[i] = palavra.charAt(i);
        }
        return letras;
    }

    public static int numerosImpares() {
        int result = 0;
        for (int i = 1; i < 500; i++) {
            boolean isImpar = i % 2 == 1;
            boolean isMultiplo7 = i % 7 == 0;

            if (isImpar && isMultiplo7) {
                result += i;
            }
        }
        return result;
    }

    public static double calculaMedia(double[] notas) {
        double total = 0d;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        return total / notas.length;
    }

    public static int fatorial(int numero) {
        int fatorial = 1;
        System.out.print(numero + "! = ");
        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            System.out.print(i + (i != 1 ? "x" : ""));
        }
        System.out.print("=");
        return fatorial;
    }

    public static double imc(double altura, double peso) {
        double imc = peso / (altura * altura);
        return imc;
    }

    public static double operador(int valorUm, int valorDois, char operacao) {
        
        if (operacao == '/') return valorUm / valorDois;
        if (operacao == '*') return valorUm * valorDois;
        if (operacao == '+') return valorUm + valorDois;
        if (operacao == '-') return valorUm - valorDois;
        
        throw new Error("Operação invalida");
    }

    public static int[] notasNecessarias(int valor) {
        int[] notas = new int[6];
        // // Notas: R$ 200, R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1
        // nota
        // // de R$ 10 e 1 nota de R$ 5

        return notas;
    }
}
