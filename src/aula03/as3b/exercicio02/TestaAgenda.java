package aula03.as3b.exercicio02;

import java.time.LocalDate;
import java.util.Scanner;

public class TestaAgenda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();

        System.out.println("\n------------- Escolha a opção desejada -------------");
        System.out.println("(1) - Cadastrar contato");
        System.out.println("(2) - Remover contato");
        System.out.println("(3) - Descobrir o índex do contato");
        System.out.println("(4) - Imprimir lista de contatos");
        System.out.println("(5) - Imprimir dados de um contato específico (necessário buscar o index)");
        System.out.println("\n---------------------------------------------------");

        int opcaoEscolhida = sc.nextInt();

        switch (opcaoEscolhida){

            case 1:
                System.out.println("Digite os dados do contato: Nome, Data de Nascimento e Altura.");
                agenda.armazenaPessoa(sc.nextLine(), LocalDate.parse(sc.nextLine()), sc.nextFloat());

            case 2:
                System.out.println("Digite o nome do contato que será removido.");
                agenda.removePessoa(sc.nextLine());

            case 3:
                System.out.println("Digite o nome do contato.");
                agenda.buscaPessoa(sc.nextLine());

            case 4: agenda.imprimeAgenda();

            case 5:
                System.out.println("Digíte o índex do contato");
                agenda.imprimePessoa(sc.nextInt());
        }
    }
}
