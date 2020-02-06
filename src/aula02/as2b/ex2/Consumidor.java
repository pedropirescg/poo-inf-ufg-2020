package aula02.as2b.ex2;

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
        sb.append("\nOrçamento do cliente: " + nome);
        return toString();
    }
}
