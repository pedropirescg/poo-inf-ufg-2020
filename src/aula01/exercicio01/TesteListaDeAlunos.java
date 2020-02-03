package aula01.exercicio01;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteListaDeAlunos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i, nrAlunos;

        // System.out.println("Informe a quantidade de matrículas que será listada:");
        nrAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de matrículas que será listada:"));

        // Aluno[] listaAlunos = new Aluno[nrAlunos];

        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        Integer matricula;
        String nome;

        // System.out.println("\n Lista de Alunos:");
        // System.out.println(listaAlunos.toString());

        System.out.println("Digite a matrícula e o nome do aluno");

        for (i = 0; i < nrAlunos; i++) {


            Aluno e = new Aluno();

            matricula = Integer.parseInt(JOptionPane.showInputDialog("\"Digite a matrícula do aluno\""));
            e.setMatricula(matricula);
            nome = String.format(JOptionPane.showInputDialog("Digite o nome do aluno"));
            e.setNome(nome);

            listaAlunos.add(i,e);
        }
        System.out.println(("\nImprimindo todos os alunos da turma: "));
        System.out.println(listaAlunos);
        }
    }