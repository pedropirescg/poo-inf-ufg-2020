package aula06.salaaula.endereco;

import java.util.List;

public class Bairro {
    private String regiao;
    private String nome;
    private Municipio municipio;
    private List<Endereco> enderecos;

    public Bairro(String regiao, String nome, Municipio municipio) {
        this.regiao = regiao;
        this.nome = nome;
        this.municipio = municipio;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void adicionaEndereco(Endereco e) {
        this.enderecos.add(e);
    }

    public Endereco consultaEndereco(Endereco e) { // Usamos o contains ao invés do equals porque não temos um parâmetro
        Endereco novoEndereco = null;              // Logo, tivemos que utilizar o objeto inteiro para realizar a busca.
        if (this.enderecos.contains(e)) {
            novoEndereco = e;
        }
        return novoEndereco;
    }

    public void removeEndereco(Endereco e) {
        this.enderecos.remove(e);
    }
}
