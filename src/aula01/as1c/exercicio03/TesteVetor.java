package aula01.as1c.exercicio03;

import javax.swing.*;
import java.util.Scanner;

public class TesteVetor {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int contador = Integer.parseInt(JOptionPane.showInputDialog("\"Digite a quantidade de números que serão armazenados\""));
        int [] vetor = new int[contador];
        int i;

        for(i = 0; i < contador; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
        }

        ordenaCrescente(vetor);

        System.out.println("\n Números ordenados de forma crescente: ");
        for (int numero: vetor) {
            System.out.println(numero);
        }

        ordenaDecrescente(vetor);

        System.out.println("\nNúmeros ordenados de forma crescente: ");
        for (int numero: vetor) {
            System.out.println(numero);
        }

        int numero = Integer.parseInt(JOptionPane.showInputDialog("\nDigite um valor para busca"));
        if(buscaNumero(numero, vetor)){
            System.out.println("\nNúmero: " + numero + " encontrado na posição " + i);
        } else {
            System.out.println("\nNúmero não encontrado");
        }
    }

    public static void ordenaCrescente(int vetor[]){
        int auxC = 0; // Variável auxiliar para ordenação
        for (int l = 0; l < vetor.length; l++){
            for (int c = 0; c < vetor.length; c++){
                if (vetor[l] < vetor[c]){
                    auxC = vetor[l];
                    vetor[l] = vetor[c];
                    vetor[c] = auxC;
                }
            }
        }
    }

    public static void ordenaDecrescente(int vetor[]){
        int auxD = 0; // Variável auxiliar para ordenação
        for (int l = 0; l < vetor.length; l++){
            for (int c = 0; c < vetor.length; c++){
                if (vetor[l] > vetor[c]){
                    auxD = vetor[l];
                    vetor[l] = vetor[c];
                    vetor[c] = auxD;
                }
            }
        }
    }
    public static boolean buscaNumero(int x, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                return true;
            }
        } return false;
    }
}

    /* static boolean buscaNumero(int x, int[] vetor) {
        for (int numero : vetor) {
            if (vetor[]) {
                return true;
            }
            return false;
        }
    } */







