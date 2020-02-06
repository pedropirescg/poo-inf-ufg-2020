package aula11.salaaula.singleton.ex_banco;

public class Conta {
    Banco banco;
    int codigo;
    String nome;

    Conta(int codigo, String nome){
        banco = Banco.getInstacia();
        this.codigo = codigo;
        this.nome = nome;
    }
}
