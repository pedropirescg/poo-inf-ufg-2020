package aula04.as4b.ex1.musicasecompositores;

public class Compositor {
    private String nome;
    private String nacionalidade;

    public Compositor(String nomeCompositor, String nacionalidade) {
        this.nome = nomeCompositor;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.getNome());
        sb.append(this.getNacionalidade());
        return sb.toString();
    }
}
