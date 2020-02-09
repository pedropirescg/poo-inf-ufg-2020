package aula04.as4b.exercicio01.alunosecursos;

public class Curso {
    private String nome;
    private String silga;
    private Departamento departamento;

    public Curso(String nome, String silga) {
        this.nome = nome;
        this.silga = silga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSilga() {
        return silga;
    }

    public void setSilga(String silga) {
        this.silga = silga;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", silga='" + silga + '\'' +
                ", departamento=" + departamento +
                '}';
    }
}
