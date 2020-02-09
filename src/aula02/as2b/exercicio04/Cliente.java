package aula02.as2b.exercicio04;

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
        sb.append("A conta do cliente: " + this.getNome());
        return sb.toString();
    }
}
