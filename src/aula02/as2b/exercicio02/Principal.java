package aula02.as2b.exercicio02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor();
        Carro carro = new Carro();

        System.out.println("Digite o nome do cliente e o custo do carro");

        try{
            Scanner sc = new Scanner(System.in);
            if(sc.hasNextDouble())
                carro.setCustoFabrica(sc.nextDouble());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try{
            Scanner sc = new Scanner(System.in);
           if(sc.hasNextDouble())
               carro.setCustoFabrica(sc.nextDouble());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        double valorCarro = (carro.getCustoFabrica()) + (carro.getCustoFabrica()*carro.getCustoDistribuidor()) +
                (carro.getCustoFabrica()*carro.getValorImposto());

        System.out.println("\nO veículo do cliente " + consumidor.getNome() + " com custo de fábrica " + carro.getCustoFabrica() +
                " possui valor final = " + valorCarro);
    }
}
