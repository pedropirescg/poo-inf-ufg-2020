package aula4.salaaula.contabancaria;

import java.util.ArrayList;
import java.util.List;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumero(324566);
        contaBancaria.setSaldo(15000.0d);
        contaBancaria.setLimite(500.0d);
        contaBancaria.setTipo("Corrente");

        List<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cli = new Cliente();
        cli.setNome("Pedro Pires");
        cli.setEndereco("Rua S-2, 913, Setor Bela Vista");
        cli.setCPF("01212350123");

        Cliente cli1 = new Cliente();
        cli1.setNome("Thais Carvalho");
        cli1.setEndereco("Rua S-2, 913, Setor Bela Vista");
        cli1.setCPF("01212350123");

        clientes.add(cli);
        clientes.add(cli1);

        contaBancaria.setTitulares(clientes);
        System.out.println("Nome dos Titulares da Conta: \n");
        for (Cliente c : contaBancaria.getTitulares()) {
            System.out.println(c.getNome());
        }
    }
}
