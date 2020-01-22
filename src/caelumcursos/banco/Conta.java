package caelumcursos.banco;

public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    /*  void saca(double quantidade) {
     *   double novoSaldo = this.saldo - quantidade;
     *     this.saldo = novoSaldo;
     * }
     ***/ //Método Void que não retorna valor.

    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true; // A chave return do método indica final da execução deste método e o tipo de dado que será retornado.
        }
    }

    /* void transfere(Conta destino, double valor) {
     *    this.saldo = this.saldo - valor;
     *   destino.saldo += valor;
     *}
     ***/ //Esse método não verifica se há saldo disponível.

    boolean transferePara(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            System.out.println("Não foi possível realizar o saque.");
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }
}
