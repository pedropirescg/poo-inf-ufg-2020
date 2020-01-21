package aula03.salaaula;

import java.util.Date;

public class Pessoa {
    public final String especie = "Mamífero";
    private String nome;
    private Date dataNascimento;

    // Métodos (interface da classe)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome: " + this.getNome());
        return sb.toString();
    }
}
