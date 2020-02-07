package aula14.salaaula.teste;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import aula03.as3b.ex01.Pessoa;
import util.ConverteData;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTeste {

  private Pessoa pessoa;

  @Before
  public void setup() {
    pessoa = new Pessoa();
  }

  /*@Test
   public void testaIdade() {
    pessoa.setNome("Malaquias");
    try{
      pessoa.setDataNascimento(
              ConverteData.convertStringToDate("20/10/2000"));
    } catch (Exception e){
      e.getMessage();
    }
    //assertTrue(pessoa.calculaIdade(pessoa.getDataNascimento()) == 20);
  }*/
}