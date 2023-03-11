
//Inicialização
import java.util.*;

//Classe Bhaskara
class Bhaskara {

    public double a, b, c;

    // Objeto Bhaskara
    public Bhaskara() {
        Scanner ler = new Scanner(System.in);
        System.out.print("\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n");
        System.out.print("Informe o valor de a: ");
        a = ler.nextDouble();
        System.out.print("Informe o valor de b: ");
        b = ler.nextDouble();
        System.out.print("Informe o valor de c: ");
        c = ler.nextDouble();
    }

    // Objeto Delta
    public double delta() {
        return (Math.pow(b, 2)) - (4 * a * c);
    }

    // Objeto Raiz X1
    public double raiz_X1(double valor_delta) {
        return ((-b) + Math.sqrt(valor_delta)) / (2 * a);
    }

    // Objeto Raiz X2
    public double raiz_X2(double valor_delta) {
        return ((-b) - Math.sqrt(valor_delta)) / (2 * a);
    }
}

public class Equacao_quadratica_Classe {

    public static void main(String[] args) {

        double valor_delta = 0, x1 = 0, x2 = 0;

        Bhaskara objeto = new Bhaskara();
        valor_delta = objeto.delta();
        System.out.println("\nDelta = " + valor_delta);

        // Tipos de Delta
        if (valor_delta < 0) {

            System.out.println("\nNao possui raizes reais \n");
            System.out.print("\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n");
        }

        if (valor_delta > 0) {

            x1 = objeto.raiz_X1(valor_delta);
            x2 = objeto.raiz_X2(valor_delta);
            System.out.println("\nPossui duas raizes reais: \n");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
            System.out.print("\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n");
        }

        if (valor_delta == 0) {

            x1 = objeto.raiz_X1(valor_delta);
            x2 = objeto.raiz_X2(valor_delta);
            System.out.println("\nPossui uma raiz real (Multiplicidade der raizes): \n");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
            System.out.print("\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n");
        }
    }
}