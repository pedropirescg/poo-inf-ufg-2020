package aula04.as4b.ex1;

public class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private Compositor compositor;

    public Musica(String nomeMusica, int ano, String tipo){
        this.nome = nomeMusica;
        this.ano = ano;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Compositor getCompositor() {
        return compositor;
    }

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nMúsica: " + this.getNome());
        sb.append("\nAno de Lançamento: " + this.getAno());
        sb.append("\nTipo de gênero: " + this.getTipo());
        sb.append("\nNome do Compositor: " + this.getCompositor().getNome());
        sb.append("\nNacionalidade do Compositor: " + this.getCompositor().getNacionalidade());
        return sb.toString();
    }
}
