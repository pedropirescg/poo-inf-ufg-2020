package aula10.as10b.exercicio01;

public class Cliente implements SomadorEsperado{

    private SomadorEsperado somador;

    public Cliente(SomadorEsperado somador) {
        this.somador = somador;
    }

    public Cliente() {

    }

    public void executar() {
        int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = somador.somaVetor(vetor);
        System.out.println("Resultado: " + soma);
    }

    @Override
    public int somaVetor(int[] vetor) {
        return 0;
    }
}