
//Inicialização
import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {

        // Declaração de variáveis
        Scanner input = new Scanner(System.in);
        String nome = "";
        float nota = 0;
        int faltas = 0;
        int tipo_prova = 0;

        // Método de avaliação da instituição de ensino
        final int media = 60;
        final int recuperacao = 40;
        final int max_faltas = 20;

        // Entrada e saida
        System.out.println("\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("\n insira seu nome \n");
        nome = input.nextLine();
        System.out.println("\n insira a nota \n");
        nota = input.nextFloat();
        System.out.println("\n insira o numero de faltas \n");
        faltas = input.nextInt();
        System.out.println("\n insira o tipo da prova \n");
        tipo_prova = input.nextInt();
        System.out.println("\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx \n");
        System.out.printf("\n %s \n\n", nome);

        // Lógica do resultado
        if ((nota >= media) && (faltas <= max_faltas)) {
            System.out.println("\n Aprovado \n");
        } else if (nota >= recuperacao && (faltas <= max_faltas)) {
            System.out.println("\n Recuperacao \n");
        } else {
            System.out.println("\n Reprovado \n");
        }

        // Tipos de prova
        switch (tipo_prova) {

            case 1:
                System.out.println("\n Gabarito 01 \n");
                break;

            case 2:
                System.out.println("\n Gabarito 02 \n");
                break;

            case 3:
                System.out.println("\n Gabarito 03 \n");
                break;

            case 4:
                System.out.println("\n Gabarito 04 \n");
                break;

            default:
                System.out.println("\n Nao tem Gabarito \n");
                break;
        }
        System.out.println("\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx \n");
    }
}
