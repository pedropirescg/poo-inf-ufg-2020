package util;

import java.util.Random;

public class GeraDataString {

    private int dia;
    private int mes;
    private int ano;
    private Random random;

    public GeraDataString(){
        this.random = new Random();
    }

    private int geraMes(){
        int m  = random.nextInt(12);
        return m + 1;
    }

    private int geraDia(int mes){
        int d = 0;
        int[] mes30 = {4,6,9,11};
        int[] mes31 = {1,3,5,7,8,10,12};
        for (int i = 0; i < mes30.length; i++){
            if(mes == mes30[i]){
                d = random.nextInt(30);
                break;
            }else{
                for(int j = 0; j < mes31.length; j++){
                    if (mes == mes31[j]){
                        d = random.nextInt(31);
                        break;
                    }else{
                        d = random.nextInt(28);
                    }
                }
            }
        }
        return d + 1;
    }

    private int geraAno(){
        int a = random.nextInt(2020);
        return a;
    }

    private String formataDia(int dia){
        String d = String.valueOf(dia);
        if(d.length() < 2)
            return "0"+d;
        else
            return d;
    }

    private String formataMes(int mes){
        String m = String.valueOf(mes);
        if(m.length() < 2)
            return "0"+m;
        else
            return m;
    }

    private String formataAno(int ano){
        String a = String.valueOf(ano);
        String anoFormatado = null;
        if(a.length() == 1){
            anoFormatado =  "000"+a;
        }else if(a.length() == 2){
            anoFormatado =  "00"+a;
        }else if(a.length() == 3){
            anoFormatado =  "0"+a;
        }else{
            anoFormatado = a;
        }
        return anoFormatado;
    }

    public String geraData(){
        mes = geraMes();
        dia = geraDia(mes);
        ano = geraAno();

        return formataDia(dia)  + "/" + formataMes(mes) + "/" + formataAno(ano);

    }

}
