package aula02.as2b.ex3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcularPessoas {
    public static void main(String[] args) {

        List<Pessoa> habitantes = new ArrayList<Pessoa>();

            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite a data de nascimento da pessoa");
                while (sc.hasNext()){
                    Pessoa novoHabitante = new Pessoa();

                    try{
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
                        LocalDate localDate = LocalDate.parse(sc.nextLine(), formatter);
                        novoHabitante.setDataNascimento(localDate);
                    } catch (DateTimeParseException e ){
                        e.getMessage();
                        System.out.println("Cadastro Finalizado");
                        break;
                    }

                    //novoHabitante.isBefore(habitantes.);

                    System.out.println("Digite o nome da pessoa");
                    novoHabitante.setNome(sc.nextLine());

                    System.out.println("Digite o sexo da pessoa");
                    novoHabitante.setSexo(SexoPessoa.valoresListados(sc.nextLine()));

                    System.out.println("Digite a cor do cabelo da pessoa");
                    novoHabitante.setCorDoCabelo(CabeloPessoa.valoresListados(sc.nextLine()));

                    System.out.println("Digite a cor dos olhos da pessoa");
                    novoHabitante.setCorDosOlhos(OlhosPessoa.valoresListados(sc.nextLine()));

                    habitantes.add(novoHabitante);

                    System.out.println(novoHabitante.toString());
                    System.out.println("Digite a data de nascimento da pessoa");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
