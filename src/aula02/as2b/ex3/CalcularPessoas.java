package aula02.as2b.ex3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

                    System.out.println("Digite o nome da pessoa.");
                    novoHabitante.setNome(sc.nextLine());

                    System.out.println("Digite o sexo da pessoa");
                    novoHabitante.setSexo(SexoPessoa.valoresListados(sc.nextLine()));

                    System.out.println("Digite a cor do cabelo da pessoa");
                    novoHabitante.setCorDoCabelo(CabeloPessoa.valoresListados(sc.nextLine()));

                    System.out.println("Digite a cor dos olhos da pessoa");
                    novoHabitante.setCorDosOlhos(OlhosPessoa.valoresListados(sc.nextLine()));

                    habitantes.add(novoHabitante);

                    System.out.println("-------------Cadastro Realizado -------------");
                    System.out.println(novoHabitante.toString());
                    System.out.println("\n-------------Cadastro Realizado -------------");
                    System.out.println("\nDigite a data de nascimento da pessoa ou digite -1 para finalizar o cadastro.\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        Collections.sort(habitantes, new ComparandoObjetos());

        LocalDate menorData = (habitantes.get(0).getDataNascimento());
        menorData.getYear();

        List<Pessoa> resultados = habitantes.stream().filter(s-> s.getIdade() >= 18 && s.getIdade() <=35 &&
                SexoPessoa.FEMININO==s.getSexo() && CabeloPessoa.LOURO==s.getCorDoCabelo() &&
                OlhosPessoa.VERDE==s.getCorDosOlhos()).collect(Collectors.toList());

        Integer percentualPessoas = (resultados.size() / habitantes.size()) * 100;

        System.out.println("A pessoa mais velha da lista nasceu no ano de: " + menorData);
        System.out.println("O percentual de pessoas do sexo feminino, cuja idade" +
                " está entre 18 e 35 anos, que possuem olhos verdes e cabelos louros é de: " + percentualPessoas + " %");
    }
}
