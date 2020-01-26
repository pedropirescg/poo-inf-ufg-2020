/* package as1c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListarAlunos {

    public static void main(String[] args) {
        listaAlunos();
    }

    public static void listaAlunos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos que será lida\n");
        int nrAluno = sc.nextInt();

        Aluno aluno;

        List<Aluno> listAlunos = new ArrayList<Aluno>();

        int i;

        for (i = 0, i < nrAluno, i++) {
            aluno = new Aluno();
        }
        System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
        int n = listAlunos.size();
        for (i = 0; i < n; i++) {
            System.out.printf("Posição %d- %s\n", i, listAlunos.get(i));
        }
    }
}
*/