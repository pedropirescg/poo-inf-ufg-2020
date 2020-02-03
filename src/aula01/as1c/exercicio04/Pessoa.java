package aula01.as1c.exercicio04;

public class Pessoa {
    String nome;
    Integer telefone;

    public Pessoa(String nome, Integer telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
}
