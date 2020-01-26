package aula01.exercicio01;

public class Aluno {
    private String nome;
    private Integer matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
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
