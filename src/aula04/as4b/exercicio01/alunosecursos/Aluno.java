package aula04.as4b.exercicio01.alunosecursos;

public class Aluno {
    private String nome;
    private Integer matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome, Integer matricula, int ano) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
    }

    public Aluno(){

    }

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome : " + this.getNome());
        sb.append("\nMatrícula: " + this.getMatricula());
        sb.append("\nAno de início: " + this.getAno());
        sb.append("\nNome do Curso: " + this.getCurso().getNome());
        sb.append("\nSigla do Curso: " + this.getCurso().getSilga());
        sb.append("\nNome do Departamento: " + this.getCurso().getDepartamento().getNome());
        sb.append("\nSigla do Departamento: " + this.getCurso().getDepartamento().getSigla());
        return sb.toString();
    }
}
