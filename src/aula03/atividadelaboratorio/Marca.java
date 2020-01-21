package aula03.atividadelaboratorio;

public class Marca {
    private String nome;
    private int cnpj;
    private String nomeContato;
    private int telefoneContato;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeContato() {
        return this.nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public int getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(int telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Marca: " + this.getNome());
        sb.append("CNPJ: " + this.getCnpj());
        sb.append("Nome de Contato: " + this.getNomeContato());
        sb.append("Telefone do Contato: " + this.getTelefoneContato());
        return sb.toString();
    }
}
