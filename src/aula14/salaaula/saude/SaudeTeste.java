package aula14.salaaula.saude;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SaudeTeste {

    @Test
    void testeCondicao() {
        Saude saude = new Saude(20, 1.64, 62);
        assertTrue(saude.condicaoFisica().equals("Peso normal"));
    }

    @Test
    void testeIMC() {
        Saude saude = new Saude(20, 1.64, 62);
        assertEquals(saude.calculaIMC(), 23, 0.5);
    }

}
