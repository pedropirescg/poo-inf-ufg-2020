package aula01.exercicio01;

import java.util.Scanner;

public class TesteListaDeAlunos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i, nrAlunos;

        System.out.println("Informe a quantidade de matrículas que será listada:");
        nrAlunos = entrada.nextInt();

        Turma[] listaAlunos;
        listaAlunos = new Turma[nrAlunos];

        Integer matricula;
        String nome = null;

        System.out.println("\n Lista de Alunos:");
        System.out.println(listaAlunos.toString());

        for (i = 0; i < nrAlunos; i++) {

            Turma aluno = new Turma();

            System.out.println("Digite a matrícula e o nome do aluno");
            matricula = entrada.nextInt();
            aluno.adicionaAlunos(matricula, nome);

        }
    }
}
