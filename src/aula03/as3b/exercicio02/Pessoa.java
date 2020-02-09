package aula03.as3b.exercicio02;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private float altura;

    public Pessoa(String nome, LocalDate idade, float altura){
        this.nome = nome;
        this.dataNascimento = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.getNome());
        sb.append(this.getDataNascimento());
        sb.append(this.getAltura());
        return sb.toString();
    }
}
