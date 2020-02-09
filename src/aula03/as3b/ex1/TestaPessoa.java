package aula03.as3b.ex01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("Digite seu nome");
        pessoa.setNome(sc.nextLine());

        System.out.println("Digite sua altura");
        pessoa.setAltura(Double.parseDouble(sc.nextLine()));

        System.out.println("Digite sua data de nascimento");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        LocalDate localDate = LocalDate.parse(sc.nextLine(), formatter);
        pessoa.setDataNascimento(localDate);

        System.out.println(pessoa.toString());
    }
}
