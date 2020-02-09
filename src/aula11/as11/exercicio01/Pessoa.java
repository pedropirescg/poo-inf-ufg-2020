package aula11.as11.exercicio01;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private float altura;

    public Pessoa(String nome, String idade, float altura){
        this.nome = nome;
        this.dataNascimento = idade;
        this.altura = altura;
    }

    public Pessoa() {

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
