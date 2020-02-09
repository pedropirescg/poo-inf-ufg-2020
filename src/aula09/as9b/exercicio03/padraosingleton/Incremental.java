package aula09.as9b.exercicio03.padraosingleton;

public class Incremental {
    private static int count = 0;
    private int numero;

    public static Incremental instancia;

    protected Incremental() {
    }

    public static Incremental getInstance() {
        if(instancia == null) {
            instancia = new Incremental();
            instancia.incrementar();
            }
        return instancia;
    }

    public void incrementar() {
        numero = ++count;
    }

    public String toString() {
        return "Incremental " + numero;
    }
}

class TesteIncremental {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            Incremental inc = Incremental.getInstance();
            System.out.println(inc);

            /**
             * ----------------- Outra opção -----------------
             * System.out.println(Incremental.getInstance());
             */
        }
    }
}
