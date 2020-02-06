package util;

import java.util.Random;

public class GeraNome {

    int i,nrAleatorioVogal,nrAleatorioConsoante;

    String vogal [] = {"a","e","i","o","u",};
    String vc = "";




    String consoante [] = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","w","x","y","z"};

    Random random = new Random();

    private String geraNome1(){
        String nome1 = "";
        for(i = 0 ; i <= 4; i++){

            nrAleatorioVogal = 0 + random.nextInt(4);//escolhe uma pos de 0 a 4

            nrAleatorioConsoante = 0 + random.nextInt(19);//escolhe pos de 0 a 19

            vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];

            nome1 = nome1 + vc;
        }
        return nome1;
    }

    private String geraNome2(){
        String nome2 = "";
        for(i = 0 ; i <= 4; i++){

            nrAleatorioVogal = 0 + random.nextInt(4);//escolhe uma pos de 0 a 4

            nrAleatorioConsoante = 0 + random.nextInt(19);//escolhe pos de 0 a 19

            vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];

            nome2 = nome2 + vc;

        }

        return nome2;
    }

    private String geraNome3(){
        String nome3 = "";
        for(i = 0 ; i <= 4; i++){

            nrAleatorioVogal = 0 + random.nextInt(4);//escolhe uma pos de 0 a 4

            nrAleatorioConsoante = 0 + random.nextInt(19);//escolhe pos de 0 a 19

            vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];

            nome3 = nome3 + vc;

        }

        return nome3;
    }

    public String geraNome(){
        return geraNome1() + " " + geraNome2() + " " + geraNome3();
    }

}
