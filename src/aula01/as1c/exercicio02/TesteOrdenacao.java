package aula01.as1c.exercicio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TesteOrdenacao {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int i;

            ArrayList<Integer> lista = new ArrayList<>();

            for (i = 0; i < 3; i++) {
                System.out.println("\nDigite um número: ");
                lista.add(sc.nextInt());
            }

            sc.close();

            Collections.sort(lista);

            System.out.println("\n Lista lida:");
            System.out.println(lista.toString());
        }
}

