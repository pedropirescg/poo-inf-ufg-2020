package aula02.as2b.exercicio01;

import javax.swing.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculaIdade {
    public static void main(String[] args) throws ParseException {

        LocalDate dataAtual = LocalDate.now();

        Pessoa p1 = new Pessoa();
        String nome1 = JOptionPane.showInputDialog("Digite o nome da pessoa");
        p1.setNome(nome1);
        String dataNascimento1 = JOptionPane.showInputDialog("Digite a data de nascimento no formado dd/mm/aaaa.");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(dataNascimento1, formatter1);
        p1.setDataNascimento(dataNascimento1);

        Pessoa p2 = new Pessoa();
        String nome2 = JOptionPane.showInputDialog("Digite o nome da pessoa");
        p2.setNome(nome2);
        String dataNascimento2 = JOptionPane.showInputDialog("Digite a data de nascimento no formado dd/mm/aaaa.");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate2 = LocalDate.parse(dataNascimento2, formatter2);
        p2.setDataNascimento(dataNascimento2);

        if(dataNascimento1.equals(dataNascimento2)){
            System.out.println("Ambos possuem a mesma idade");
        } else if(dataNascimento1.hashCode() < dataNascimento2.hashCode()){
            System.out.println("\n" + p1.getNome() + ", nascido em " + p1.getDataNascimento() +
                    " é mais velho que " + p2.getNome() + ", nascido em " + p2.getDataNascimento());
        } else {
            System.out.println("\n" + p2.getNome() + ", nascido em " + p2.getDataNascimento() +
                    " é mais velho que " + p1.getNome() + ", nascido em " + p1.getDataNascimento());
        }
    }
}
