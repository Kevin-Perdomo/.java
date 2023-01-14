public class primeiro {
    public static void main(String[] args) {

        int nota = 60;
        int faltas = 20;
        int tipo_prova = 2;

        int media = 60;
        int recuperacao = 40;
        int max_faltas = 20;

        if ((nota >= media) && (faltas <= max_faltas)) {
            System.out.println("\n\t Aprovado \n");
        } else if (nota >= recuperacao && (faltas <= max_faltas)) {
            System.out.println("\n\t Recuperacao \n");
        } else {
            System.out.println("\n\t Reprovado \n");
        }

        switch (tipo_prova) {

            case 1:
                System.out.println("\n\t Gabarito 01 \n\n");
                break;

            case 2:
                System.out.println("\n\t Gabarito 02 \n\n");
                break;

            case 3:
                System.out.println("\n\t Gabarito 03 \n\n");
                break;

            case 4:
                System.out.println("\n\t Gabarito 04 \n\n");
                break;

            default:
                System.out.println("\n\t Nao tem Gabarito \n\n");
                break;
        }
    }
}
