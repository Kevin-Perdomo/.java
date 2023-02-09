
//Inicialização
import java.util.Scanner;

public class Equacao_quadratica {
    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;

        // Input parameters
        Scanner input = new Scanner(System.in);
        System.out.print("\n\n Informe o valor de a: ");
        a = input.nextDouble();
        System.out.print("\n Informe o valor de b: ");
        b = input.nextDouble();
        System.out.print("\n Informe o valor de c: ");
        c = input.nextDouble();
        System.out.printf("\n\n Sua Funcao Quadratica: %.2fX² %.2fX %.2f = 0 \n", a, b, c);

        // Calculo o delta
        delta = (Math.pow(b, 2) - (4 * a * c));
        System.out.printf("\n Valor de delta: %.2f \n", delta);

        // Tipos de Delta
        if (delta > 0) {
            System.out.println("\n\n Possui duas raizes reais: \n");
            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.printf(" Valor da raiz X1 = %.2f", x1);
            System.out.printf("\n\n Valor da raiz X2 = %.2f \nn", x2);
        }

        if (delta == 0) {
            System.out.println("\n\n Possui apenas uma raiz real (Multiplicidade de Raizes): \n");
            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.printf(" Valor da raiz X1 = %.2f", x1);
            System.out.printf("\n\n Valor da raiz X2 = %.2f \n\n", x2);
        }

        if (delta < 0) {
            System.out.println("\n\n Nao possui raizes reais \n\n");
        }

        System.exit(0);
    }
}
