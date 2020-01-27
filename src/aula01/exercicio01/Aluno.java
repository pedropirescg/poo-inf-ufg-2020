package aula01.exercicio01;

public class Aluno {
    private String nome;
    private Integer matricula;

    public Aluno(Integer matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
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

        lista.append("\nImprimindo todos os alunos da turma: ");
        lista.append("\n" + this.getMatricula() + " - " + this.getNome());
        return lista.toString();
    }
}
