package aula02.as2b.ex1;

public class Pessoa {
    private String nome;
    private String dataNascimento;

    public Pessoa(){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome: " + nome);
        sb.append("\nData de Nascimento: " + dataNascimento);
        return sb.toString();
    }
}
