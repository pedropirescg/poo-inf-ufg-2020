package aula02.as2b.exercicio02;

public class Consumidor {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\nOrçamento do cliente: " + this.getNome());
        return toString();
    }
}
