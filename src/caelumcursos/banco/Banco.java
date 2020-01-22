package caelumcursos.banco;

public class Banco {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.dono = "Duke";
        minhaConta.saldo = 1000.0d;

        System.out.println("O dono da conta é: " + minhaConta.dono + " e o saldo é de: " + minhaConta.saldo);
    }
}
