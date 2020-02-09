package aula04.as4b.exercicio01.alunosecursos;

public class TestaInstancias {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Curso curso = new Curso("Engenharia de SW", "ES");
        curso.setDepartamento((new Departamento("Instituto de Informática", "INF")));
        aluno.setNome("Pedro");
        aluno.setMatricula(201515577);
        aluno.setAno(2015);
        aluno.setCurso(curso);

        System.out.println(aluno);
    }
}
