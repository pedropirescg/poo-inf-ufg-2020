package aula02.as2b.exercicio01;

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
        sb.append("\nNome: " + this.getNome());
        sb.append("\nData de Nascimento: " + this.getDataNascimento());
        return sb.toString();
    }
}
