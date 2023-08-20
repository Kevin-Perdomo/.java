
//Inicialização
import java.util.Scanner;

//Teste de número primo com passagem de parametro por função
public class Teste_número_primo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int resultado = 0;
        int numero = 0;

        System.out.println("\n\n insira um numero inteiro Positivo \n\n");
        numero = input.nextInt();

        // 0 e 1 não são números primos
        if (numero == 0 || numero == 1) {
            resultado = 1;
        } else {
            resultado = teste_primo(numero);
        }

        // resultado (0) ou (1)
        if (resultado == 0) {
            System.out.printf("\n O número %d é primo \n\n", numero);
        } else {
            System.out.printf("\n O número %d nao é primo \n\n", numero);
        }
    }

    // Lógica do teste
    static int teste_primo(int num) {

        int auxiliar = 0;

        for (int contador = 2; contador < num; contador++) {
            if (num % contador == 0) {
                auxiliar++;
                break;
            }
        }
        return auxiliar;
    }
}