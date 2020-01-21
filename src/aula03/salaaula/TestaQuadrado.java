package aula03.salaaula;

public class TestaQuadrado {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        Quadrado q3 = new Quadrado();

        Quadrado.cor = "Verde";
        Quadrado.cor = "Vermelho";

        System.out.println("Cor do Quadrado Q1: " + Quadrado.cor);
        System.out.println("Cor do Quadrado Q2: " + Quadrado.cor);
        System.out.println("Cor do Quadrado Q3: " + Quadrado.cor);
        System.out.println("Cor da Classe: " + Quadrado.cor);

    }
}
