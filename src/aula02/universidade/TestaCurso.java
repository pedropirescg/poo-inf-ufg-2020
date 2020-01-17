package aula02.universidade;

import java.util.Scanner;

public class TestaCurso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Curso curso1 = new Curso(); // Curso 1
        System.out.println("Entre com o nome, a área, o tipo e a duração do curso. \n");
        curso1.nome = sc.nextLine();
        curso1.area = sc.nextLine();
        curso1.tipo = sc.nextLine();
        curso1.duracao = Integer.parseInt(sc.nextLine());
        System.out.println("Nome do curso: " + curso1.nome + "\n" + "Área: " + curso1.area + "\n" + "Tipo: "
                + curso1.tipo + "\n" + "Duração do Curso: " + curso1.duracao + "\n");

        // curso1.nome = JOptionPane.showInputDialog("Entre com o nome do Curso."); --> SCANNER COM JANELA
        // JOptionPane.showMessageDialog(null, "Nome do curso: " + curso1.nome + "\n"); --> SOUT COM JANELA

        /* curso1.nome = "Sistema da Informação";
        curso1.area = "Ciências Exatas";
        curso1.tipo = "Computação";
        curso1.duracao = 3600;
        System.out.println("Nome do curso: " + curso1.nome + "\n" + "Área: " + curso1.area + "\n" + "Tipo: "
                + curso1.tipo + "\n" + "Duração do Curso: " + curso1.duracao + "\n"); */

        Curso curso2 = new Curso();
        curso2.nome = "Sistema da Informação";
        curso2.area = "Ciências Exatas";
        curso2.tipo = "Computação";
        curso2.duracao = 3600;
        System.out.println("Nome do curso: " + curso2.nome + "\n" + "Área: " + curso2.area + "\n" + "Tipo: "
                + curso2.tipo + "\n" + "Duração do Curso: " + curso2.duracao + "\n");

        /* Curso curso1 = new Curso(); // Até Curso curso1 apenas foi reservado espaço na memória.
        curso1.nome = "Ciência da Computação";
        curso1.area = "Ciência da Computação";
        curso1.tipo = "Ciência da Computação";
        curso1.duracao = "Ciência da Computação";
        System.out.println("Nome do curso: " + curso1.nome);

        Curso curso2 = new Curso();
        curso2.nome = "Engenharia de Software";
        System.out.println("Nome do curso: " + curso2.nome);
        */
    }
}
