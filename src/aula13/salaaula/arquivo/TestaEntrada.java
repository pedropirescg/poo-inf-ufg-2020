package aula13.salaaula.arquivo;

import java.io.*;

public class TestaEntrada {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine(); //Primeira linha

        while(s != null){
            System.out.println(s);
            s = br.readLine();
        }
        br.close();
    }
}
