package Conta_Bancária;

class TestaConta {

    public static void main(String[] args) {

        Conta a1 = new Conta();
        a1.dataDeAbertura = new Data();

        a1.titular = "Kevin";
        a1.numero = 123;
        a1.agencia = "45678-9";
        a1.saldo = 0.0;
        a1.dataDeAbertura.preencheData(1, 7, 2019);

        a1.deposita(100.0);

        System.out.println("\n\n");
        System.out.println("Dados da conta:\n\n" + a1.recuperaDadosParaImpressao());
        System.out.println("\n\n");

        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        Conta c1 = new Conta();
        c1.titular = "Danilo";
        c1.saldo = 100;

        Conta c2 = new Conta();
        c2.titular = "Danilo";
        c2.saldo = 100;

        c2 = c1;

        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}