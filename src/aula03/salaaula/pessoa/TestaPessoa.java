package aula03.salaaula.pessoa;

import java.util.Date;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Jorley");
        p1.setDataNascimento(new Date());

        System.out.println("Dados d(o)a: " + p1.getNome());
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Data de Nascimento: " + p1.getDataNascimento());
        System.out.println("Espécie: " + p1.especie + "\n");

        Pessoa p2 = new Pessoa();

        p2.setNome("Mychelle Obama");
        p2.setDataNascimento(new Date());

        System.out.println("Dados d(o)a: " + p2.getNome());
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Data de Nascimento: " + p2.getDataNascimento());
        System.out.println("Espécie: " + p2.especie);
    }
}
