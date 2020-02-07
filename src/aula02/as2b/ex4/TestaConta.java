package aula02.as2b.ex4;

import javax.swing.*;

public class TestaConta {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente."));

        Conta conta = new Conta();
        conta.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo médio.")));

        int tipoConta;

        if (conta.getSaldo() <= 200.00) {
            tipoConta = 1;
        } else if (conta.getSaldo() <= 400.00) {
            tipoConta = 2;
        } else if (conta.getSaldo() <= 600.00) {
            tipoConta = 3;
        } else {
            tipoConta = 4;
        }


        switch (tipoConta) {
            case (1):
                conta.setLimite(0);
            case (2):
                conta.setLimite(conta.getSaldo() * 0.2);
            case (3):
                conta.setLimite(conta.getSaldo() * 0.3);
            case (4):
                conta.setLimite(conta.getSaldo() * 0.4);
        }

        System.out.println(cliente.getNome());
        System.out.println("O limite da conta é: " + conta.getLimite());
    }
}

