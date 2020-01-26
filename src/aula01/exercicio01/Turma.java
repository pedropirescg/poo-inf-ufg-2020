package aula01.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos;

    public Turma() {
        this.alunos = new ArrayList<Aluno>();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionaAlunos(Aluno a) {
        this.alunos.add(a);
    }


}
