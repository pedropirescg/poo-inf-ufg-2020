package aula09.as9b.exercicio03.incremental;

public class Incremental {
    private static int count = 0;
    private int numero;
    public Incremental() {
        numero = ++count;
    }
    public String toString() {
        return "Incremental " + numero;
    }
}
class TesteIncremental {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Incremental inc = new Incremental();
            System.out.println(inc);
        }
    }
}
