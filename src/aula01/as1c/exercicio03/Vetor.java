package aula01.as1c.exercicio03;

public class Vetor {
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        StringBuffer numero = new StringBuffer();

        numero.append("\nNúmero: " + this.getNumero());
        return numero.toString();
    }
}
