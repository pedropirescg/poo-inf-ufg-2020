package aula01.as1c.exercicio01;

public class Aluno {
    private String nome;
    private Integer matricula;

    public Aluno(Integer matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    public Aluno(){

    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        StringBuffer lista = new StringBuffer();

        lista.append("\nMatrícula: " + this.getMatricula() + " - Nome: " + this.getNome());
        return lista.toString();
    }
}
