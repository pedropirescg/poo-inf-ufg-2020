package aula01.as1c.exercicio04;

import javax.swing.*;

public class TesteDados {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(String.format(JOptionPane.showInputDialog("Digite o nome")));
        pessoa.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone")));

        char nomeConvertido = pessoa.getNome().charAt(0);

        boolean verificaDigNome = Character.isDigit(nomeConvertido);
        boolean verificaDigTel = Character.isDigit(pessoa.getTelefone());

        if(verificaDigNome){
            System.out.println("Inserção de dados está correta");
        } else{
            System.out.println("Nome inserido incorretamente");
        }

        if(verificaDigTel){
            System.out.println("Inserção do telefone está correta");
        } else {
            System.out.println("Telefone inserido incorretamente.");
        }
    }
}
