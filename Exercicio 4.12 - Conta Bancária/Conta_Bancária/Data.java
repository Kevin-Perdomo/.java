package Conta_Bancária;

public class Data {

    int dia;
    int mes;
    int ano;

    void preencheData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String formatar() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
