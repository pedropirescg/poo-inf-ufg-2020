package aula01.as1c.exercicio02;

import java.text.DecimalFormat;

/*
* A classe prima é Object. Todas as outras classes derivam dela.
* */
public class CalculaMedia {
    public static void main(String[] args) {
        /* * *
        * Público: Qualquer classe acessa
        * Static: Não há necessidade de instância (objeto) para execução
        * Void: Não retorna valor
        * Main: Nome
        * * **/

        String nomeAluno1 = "Paulo";
        double nota1Aluno1 = 8.0;
        double nota2Aluno1 = 6.0;
        double nota3Aluno1 = 5.0;

        String nomeAluno2 = "Maria";
        double nota1Aluno2 = 4.0;
        double nota2Aluno2 = 6.0;
        double nota3Aluno2 = 3.0;

        String nomeAluno3 = "José";
        double nota1Aluno3 = 6.0;
        double nota2Aluno3 = 4.0;
        double nota3Aluno3 = 9.0;

        String nomeAluno4 = "Patrícia";
        double nota1Aluno4 = 7.0;
        double nota2Aluno4 = 8.0;
        double nota3Aluno4 = 9.0;

        double mediaAluno1 = (nota1Aluno1 + nota2Aluno1 + nota3Aluno1) / 3;
        double mediaAluno2 = (nota1Aluno2 + nota2Aluno2 + nota3Aluno2) / 3;
        double mediaAluno3 = (nota1Aluno3 + nota2Aluno3 + nota3Aluno3) / 3;
        double mediaAluno4 = (nota1Aluno4 + nota2Aluno4 + nota3Aluno4) / 3;

        double mediaGeral =
                (mediaAluno1 + mediaAluno2 + mediaAluno3 + mediaAluno4) / 4;

        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.println("Média de " + nomeAluno1 + " = " + df.format(mediaAluno1));
        System.out.println("Média de " + nomeAluno2 + " = " + df.format(mediaAluno2));
        System.out.println("Média de " + nomeAluno3 + " = " + df.format(mediaAluno3));
        System.out.println("Média de " + nomeAluno4 + " = " + df.format(mediaAluno4));
        System.out.println("Média Geral = " + df.format(mediaGeral));
    }
}
