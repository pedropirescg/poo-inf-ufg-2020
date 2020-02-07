package aula02.as2b.ex4;

public class Cliente {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("A conta do cliente: " + nome);
        return toString();
    }
}
