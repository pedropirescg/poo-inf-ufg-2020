package aula10.as10b.exercicio01;

import java.util.List;

public class AdapterSomador implements SomadorEsperado {
    private SomadorExistente somadorExistente;

    public AdapterSomador(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }

    @Override
    public int somaVetor(int[] vetor) {
        return 0;
    }
}
