package aula02.as2b.ex3;

import java.time.LocalDate;

public class Pessoa{
    private String nome;
    private SexoPessoa sexo;
    private OlhosPessoa corDosOlhos;
    private CabeloPessoa corDoCabelo;
    private LocalDate dataNascimento;

    public Pessoa(String nome, SexoPessoa sexo, OlhosPessoa corDosOlhos,
                  CabeloPessoa corDoCabelo, LocalDate dataNascimento){
        this.nome = nome;
        this.sexo = sexo;
        this.corDosOlhos = corDosOlhos;
        this.corDoCabelo = corDoCabelo;
        this.dataNascimento = dataNascimento;
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

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\n" + nome);
        sb.append("\n" + corDoCabelo);
        sb.append("\n" + corDosOlhos);
        sb.append("\n" + dataNascimento);
        sb.append("\n" + sexo);
        return sb.toString();
    }

    /* @Override
    public boolean compareTo(Pessoa novoHabitante) {
        return getDataNascimento().isBefore(novoHabitante.getDataNascimento());
    }*/
}
