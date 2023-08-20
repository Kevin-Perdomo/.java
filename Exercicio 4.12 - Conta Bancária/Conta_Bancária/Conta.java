package Conta_Bancária;

class Conta {

    String titular;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;

    // atualiza o saldo
    void saca(double valor) {
        this.saldo -= valor;// saldo = saldo - valor;
    }

    // atualiza o saldo
    void deposita(double valor) {
        this.saldo += valor;// saldo = saldo + valor;
    }

    // retorna 10% do saldo
    double calculaRendimento() {
        return this.saldo * 0.1;// saldo = saldo * 0.1;
    }

    String recuperaDadosParaImpressao() {

        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nRendimento mensal: " + this.saldo * 0.1;
        dados += "\nData de abertura da conta: " + this.dataDeAbertura.formatar();

        return dados;
    }
}
