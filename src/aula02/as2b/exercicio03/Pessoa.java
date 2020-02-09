package aula02.as2b.exercicio03;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa{
    private String nome;
    private SexoPessoa sexo;
    private OlhosPessoa corDosOlhos;
    private CabeloPessoa corDoCabelo;
    private LocalDate dataNascimento;
    private int rollnumber;

    public Pessoa(String nome, SexoPessoa sexo, OlhosPessoa corDosOlhos,
                  CabeloPessoa corDoCabelo, LocalDate dataNascimento, int rollnumber){
        this.nome = nome;
        this.sexo = sexo;
        this.corDosOlhos = corDosOlhos;
        this.corDoCabelo = corDoCabelo;
        this.dataNascimento = dataNascimento;
        this.rollnumber = rollnumber;
    }

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SexoPessoa getSexo() {
        return sexo;
    }

    public void setSexo(SexoPessoa sexo) {
        this.sexo = sexo;
    }

    public OlhosPessoa getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(OlhosPessoa corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public CabeloPessoa getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(CabeloPessoa corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome: " + this.getNome());
        sb.append("\nCor do Cabelo: " + this.getCorDoCabelo());
        sb.append("\nCor dos Olhos: " + this.getCorDosOlhos());
        sb.append("\nData de Nascimento: " + this.getDataNascimento());
        sb.append("\nSexo: " + this.getSexo());
        return sb.toString();
    }

    /* @Override
    public boolean compareTo(Pessoa novoHabitante) {
        return getDataNascimento().isBefore(novoHabitante.getDataNascimento());
    }*/
}
