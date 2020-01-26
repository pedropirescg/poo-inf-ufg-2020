package aula01.exercicio01;

import java.util.Scanner;

public class TesteListaDeAlunos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i, nrAlunos;

        System.out.println("Informe a quantidade de matrículas que será lista");
        nrAlunos = entrada.nextInt();

        Turma[] listaAlunos;
        listaAlunos = new Turma[nrAlunos];

        Integer matricula;
        String nome;

        for (i = 1; i < nrAlunos; i++) {

            Aluno aluno = new Aluno();

            System.out.println("Digite a matrícula do aluno");
            matricula = entrada.nextInt();
            aluno.setMatricula(matricula);

            System.out.println("Digite o nome do aluno");
            nome = entrada.nextLine();
            aluno.setNome(nome);

        }
        System.out.println(listaAlunos);
    }
}
