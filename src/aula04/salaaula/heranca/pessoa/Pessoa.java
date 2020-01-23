package aula04.salaaula.heranca.pessoa;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String n, String e, String t) {
        this.nome = n;
        this.endereco = e;
        this.telefone = t;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome da Pessoa: " + this.getNome());
        sb.append("\nEndereço da Pessoa: " + this.getEndereco());
        sb.append("\nTelefone da Pessoa: " + this.getTelefone());
        return sb.toString();
    }
}
