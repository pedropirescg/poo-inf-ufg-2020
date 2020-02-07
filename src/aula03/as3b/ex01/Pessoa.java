package aula03.as3b.ex01;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private double altura;

    public Pessoa(){

    }

    public Pessoa(String nome, LocalDate data, double alt){
        this.nome = nome;
        this.dataNascimento = data;
        this.altura = altura;
    }

    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString(){
            StringBuffer sb = new StringBuffer();
            sb.append("\nNome: " + getNome());
            sb.append("\n idade: " + getIdade());
            return sb.toString();
        }
}
